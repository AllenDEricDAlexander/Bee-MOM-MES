package top.atluofu.manufacture_machine_model;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: ManufactureTechnologyModelApplication
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-30Day-22:52
 * @Version: 1.0
 */
@SpringBootApplication
@Slf4j
@MapperScan(basePackages = "top.atluofu.manufacture_machine_model.dao")
public class ManufactureMachineModelApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManufactureMachineModelApplication.class, args);
        log.info("manufacture model application start success");
    }
}
