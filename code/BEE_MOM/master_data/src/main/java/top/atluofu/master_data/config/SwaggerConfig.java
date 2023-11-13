package top.atluofu.master_data.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: SwaggerConfig
 * @description: SwaggerConfig
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-13Day-16:18
 * @Version: 1.0
 */

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("SpringDoc API Test")
                .description("SpringDoc Simple Application Test")
                .version("0.0.1"));
    }
}
