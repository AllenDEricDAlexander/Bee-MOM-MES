package top.atluofu.auth_center.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CorsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.RegexRequestMatcher;
import top.atluofu.auth_center.common.Constant;
import top.atluofu.auth_center.security.auth.MyAuthorizationManager;
import top.atluofu.auth_center.security.filter.JwtAuthenticationTokenFilter;
import top.atluofu.auth_center.security.filter.LoginAuthenticationFilter;
import top.atluofu.auth_center.security.handler.LoginFailureHandler;
import top.atluofu.auth_center.security.handler.LoginSuccessHandler;
import top.atluofu.auth_center.security.handler.NoAuthAccessDeniedHandler;

@Configuration
@Slf4j
@EnableWebSecurity
public class SecurityConfig {

    final
    NoAuthAccessDeniedHandler noAuthAccessDeniedHandler;

    private final MyAuthorizationManager authorizationManager;

    public SecurityConfig(NoAuthAccessDeniedHandler noAuthAccessDeniedHandler, MyAuthorizationManager authorizationManager, AuthenticationConfiguration authenticationConfiguration) {
        this.noAuthAccessDeniedHandler = noAuthAccessDeniedHandler;
        this.authorizationManager = authorizationManager;
        this.authenticationConfiguration = authenticationConfiguration;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(e->e.requestMatchers(Constant.annos).permitAll());
        http.authorizeHttpRequests(e->e.requestMatchers(RegexRequestMatcher.regexMatcher("^\\S*[css|js]$")).permitAll());
        http.authorizeHttpRequests(e->e.anyRequest().access(authorizationManager));

        //将JWT拦截器添加到UsernamePasswordAuthenticationFilter之前
        //登录之前验证token 从token中获取到登录凭证
        http.addFilterBefore(new JwtAuthenticationTokenFilter(),UsernamePasswordAuthenticationFilter.class);
        //重写登录
        http.addFilterAt(loginAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        http.formLogin(e->e.successHandler(new LoginSuccessHandler()).failureHandler(new LoginFailureHandler()));
        http.exceptionHandling(e->e.accessDeniedHandler(noAuthAccessDeniedHandler));
        http.csrf(CsrfConfigurer::disable);
        http.cors(CorsConfigurer::disable);

        return http.build();
    }

    final
    AuthenticationConfiguration authenticationConfiguration;

    public LoginAuthenticationFilter loginAuthenticationFilter() throws Exception {
        LoginAuthenticationFilter filter = new LoginAuthenticationFilter();
        filter.setAuthenticationSuccessHandler(new LoginSuccessHandler());
        filter.setAuthenticationFailureHandler(new LoginFailureHandler());
        //LoginAuthenticationFilter 中需要使用到AuthenticationManager 不加会出现空指针
        filter.setAuthenticationManager(authenticationConfiguration.getAuthenticationManager());
        return filter;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
