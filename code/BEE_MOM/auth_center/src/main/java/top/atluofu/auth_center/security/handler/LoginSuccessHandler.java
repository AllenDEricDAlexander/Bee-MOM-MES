package top.atluofu.auth_center.security.handler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import top.atluofu.auth_center.domain.*;
import top.atluofu.auth_center.utils.JwtUtils;
import top.atluofu.common.result.ResultUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse response, Authentication auth) throws IOException {

        User user = (User) auth.getPrincipal();

        String token = JwtUtils.token(auth);
        response.addHeader("token", token);

        response.setContentType("application/json;charset=UTF-8");
        Map<String, Object> data = new HashMap<>();
        data.put("username", user.getUsername());
        data.put("roles", user.getRoles().stream().map(Role::getTag).collect(Collectors.toList()));
        data.put("accessToken", token);
        data.put("refreshToken", token);
//        data.put("expires", DateUtils.format(DateUtils.addDay(30)));

        log.info("登录成功 {}", user.getUsername());

        response.getWriter().write(ResultUtils.success(data).toString());
    }

}
