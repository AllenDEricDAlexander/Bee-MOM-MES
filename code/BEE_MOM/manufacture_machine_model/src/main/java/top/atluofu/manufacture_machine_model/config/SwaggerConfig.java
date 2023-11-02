package top.atluofu.manufacture_machine_model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @ClassName: SwaggerConfig
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-02Day-8:47
 * @Version: 1.0
 */
//@Profile({"dev","test"})
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docker(){
        // 构造函数传入初始化规范，这是swagger2规范
        return new Docket(DocumentationType.SWAGGER_2)
                //apiInfo： 添加api详情信息，参数为ApiInfo类型的参数，这个参数包含了第二部分的所有信息比如标题、描述、版本之类的，开发中一般都会自定义这些信息
                .apiInfo(apiInfo())
                .groupName("manufacture_machine_model")
                //配置是否启用Swagger，如果是false，在浏览器将无法访问，默认是true
                .enable(true)
                .select()
                //apis： 添加过滤条件,
                .apis(RequestHandlerSelectors.basePackage("top.atluofu.manufacture_machine_model.controller"))
                //paths： 这里是控制哪些路径的api会被显示出来，比如下方的参数就是除了/user以外的其它路径都会生成api文档
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        Contact contact = new Contact("名字：atluofu", "个人链接：https://atluofu.top/", "邮箱：mqa010225@163.com");
        return new ApiInfo(
                "manufacture_machine_model",
                "manufacture_machine_model",
                "manufacture_machine_model：v1.0",
                "链接：https://atluofu.top",
                contact,
                "许可：GPL 3.0 ",
                "许可链接：atluofu.top",
                new ArrayList<>()
        );
    }
}