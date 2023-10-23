package top.atluofu.bee_mom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author MQa010225
 */
@SpringBootApplication
@MapperScan(basePackages = "top.atluofu.bee_mom.dao")
public class BeeMomApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeeMomApplication.class, args);
    }

}
