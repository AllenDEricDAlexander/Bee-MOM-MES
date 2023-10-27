package top.atluofu.master_data;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
    public static void main(String[] args) {
        SpringApplication.run(MasterDataApplication.class, args);
        log.info("enterprise master data application start success");
    }
}
