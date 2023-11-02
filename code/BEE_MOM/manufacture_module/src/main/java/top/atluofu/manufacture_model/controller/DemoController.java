package top.atluofu.manufacture_model.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DemoController
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-02Day-17:45
 * @Version: 1.0
 */

@RestController
@RequestMapping("demo")
public class DemoController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world12306";
    }

}