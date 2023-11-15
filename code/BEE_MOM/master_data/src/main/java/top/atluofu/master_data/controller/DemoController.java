package top.atluofu.master_data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.atluofu.master_data.feign.TechnologyFeignController;

/**
 * @ClassName: DemoController
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-15Day-12:00
 * @Version: 1.0
 */
@RestController
@RefreshScope
@RequestMapping("demo")
public class DemoController {
    @Autowired
    private TechnologyFeignController technologyFeignController;
    @Value("${springdoc.swagger-ui.enabled}")
    private String version;

    @GetMapping("/get")
    public String get() {
        return version;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello world By MASTER_DATA";
    }


    @GetMapping("/tec")
    public String helloTec() {
        return technologyFeignController.hello();
    }
}
