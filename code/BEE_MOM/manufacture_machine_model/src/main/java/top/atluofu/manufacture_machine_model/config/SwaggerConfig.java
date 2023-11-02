package top.atluofu.manufacture_machine_model.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: SwaggerConfig
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-02Day-12:24
 * @Version: 1.0
 */
@Configuration
public class SwaggerConfig {
    /**
     * 根据@Tag 上的排序，写入x-order
     *
     * @return the global open api customizer
     */
//    @Bean
//    public GlobalOpenApiCustomizer orderGlobalOpenApiCustomizer() {
//        return openApi -> {
//            if (openApi.getTags()!=null){
//                openApi.getTags().forEach(tag -> {
//                    Map<String,Object> map=new HashMap<>();
//                    map.put("x-order", RandomUtil.randomInt(0,100));
//                    tag.setExtensions(map);
//                });
//            }
//            if(openApi.getPaths()!=null){
//                openApi.addExtension("x-test123","333");
//                openApi.getPaths().addExtension("x-abb",RandomUtil.randomInt(1,100));
//            }
//
//        };
//    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("MOM系统API")
                        .version("1.0")
                        .description( "Knife4j集成springdoc-openapi示例")
                        .termsOfService("https://atluofu.top")
                        .license(new License().name("Apache 2.0")
                                .url("https://atluofu.top")));
    }

}