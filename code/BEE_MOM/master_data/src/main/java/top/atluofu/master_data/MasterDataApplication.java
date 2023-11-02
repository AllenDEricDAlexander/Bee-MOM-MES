package top.atluofu.master_data;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

/**
 * @ClassName: MasterDataApplication
 * @description: enterprise master data application
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-26Day-22:35
 * @Version: 1.0
 */
@SpringBootApplication
@Slf4j
@MapperScan(basePackages = "top.atluofu.master_data.dao")
public class MasterDataApplication {
    @SneakyThrows
    public static void main(String[] args) {
        ConfigurableApplicationContext application = SpringApplication.run(MasterDataApplication.class, args);
        Environment env = application.getEnvironment();
        log.info(
                """
                \t\t\n----------------------------------------------------------\n\t
                Application '{}' is running! Access URLs:\n\t
                Local: \t\thttp://localhost:{}\n\t
                External: \thttp://{}:{}\n\t
                Doc: \thttp://{}:{}/doc.html\n
                ----------------------------------------------------------
                """,
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }
}
