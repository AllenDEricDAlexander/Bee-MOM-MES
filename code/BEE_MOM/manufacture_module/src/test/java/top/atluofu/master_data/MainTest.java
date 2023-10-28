package top.atluofu.master_data;

/**
 * @ClassName: MainTest
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-26Day-23:15
 * @Version: 1.0
 */

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

@DisplayName("MainTest测试类")  //起别名
@SpringBootTest
@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest {
    @Test
    @Order(1)
    public void TestDemo(){
        log.info("测试成功");
    }

    @Test
    @Order(2)
    public void TestDemo2(){
        log.info("测试成功");
    }
}
