package top.atluofu.bee_mom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DemoController
 * @description: 测试controller
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-23Day-15:59
 * @Version: 1.0
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    @GetMapping("hello")
    public String hello() {
        return "hello world 1";
    }
}
