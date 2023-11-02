package top.atluofu.manufacture_machine_model.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: Knife4j3Config
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-02Day-11:30
 * @Version: 1.0
 */
@Configuration
@EnableKnife4j
public class Knife4j3Config implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("doc.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}