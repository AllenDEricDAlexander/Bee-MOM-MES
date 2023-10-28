package top.atluofu.manufacture_model;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: ManufactureModelApplication
 * @description: ManufactureModelApplication
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-28Day-13:37
 * @Version: 1.0
 */
@SpringBootApplication
@Slf4j
@MapperScan(basePackages = "top.atluofu.manufacture_model.dao")
public class ManufactureModelApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManufactureModelApplication.class, args);
        log.info("manufacture model application start success");
    }
}
