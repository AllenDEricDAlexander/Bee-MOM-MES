package top.atluofu.manufacture_model.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

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
        Server devServer = new Server();
        devServer.setUrl("www.atluofu.com/manufactureModel");
        devServer.setDescription("Server URL in Development environment");
        Server prodServer = new Server();
        prodServer.setUrl("www.atluofu.cn/manufactureModel");
        Contact contact = new Contact();
        contact.setEmail("mqa010225@gmail.com");
        contact.setName("Allen-D-Alexander");
        contact.setUrl("https://www.atluofu.top");
        License gpLv3License = new License().name("GNU GPLv3 License").url("https://www.gnu.org/licenses/gpl-3.0-standalone.html");
        Info info = new Info()
                .title("manufactureModel API")
                .version("0.0.1-SNAPSHOT")
                .contact(contact)
                .description("This API exposes endpoints to manage tutorials.").termsOfService("https://www.atluofu.top")
                .license(gpLv3License);
        return new OpenAPI().info(info).servers(List.of(devServer, prodServer));
    }
}
