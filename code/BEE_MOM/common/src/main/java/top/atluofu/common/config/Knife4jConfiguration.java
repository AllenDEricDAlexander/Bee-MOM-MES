package top.atluofu.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @ClassName: Knife4jConfiguration
 * @description: Knife4jConfiguration 配置类
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-26Day-23:34
 * @Version: 1.0
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("atluofu mom demo RESTful APIs")
                        .description("# atluofu mom demo RESTful APIs")
                        .termsOfServiceUrl("http://www.atluofu.top/")
                        .contact("mqa010225@163.com")
                        .version("0.1")
                        .build())
                .groupName("0.1版本")
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.atluofu.**.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
