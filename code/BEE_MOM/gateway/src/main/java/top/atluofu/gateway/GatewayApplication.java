package top.atluofu.gateway;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

/**
 * @ClassName: GatewayApplication
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-15Day-15:33
 * @Version: 1.0
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("top.atluofu")
public class GatewayApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(GatewayApplication.class, args);
        Environment env = application.getEnvironment();
        log.info(
                """
                        \t\t\n----------------------------------------------------------\n\t
                        Application '{}' is running! Access URLs:\n\t
                        Local: \t\thttp://localhost:{}\n\t
                        ----------------------------------------------------------
                        """,
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"));
    }
}
