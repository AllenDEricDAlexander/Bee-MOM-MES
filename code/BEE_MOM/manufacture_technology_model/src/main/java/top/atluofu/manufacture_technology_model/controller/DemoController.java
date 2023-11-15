package top.atluofu.manufacture_technology_model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.atluofu.manufacture_technology_model.feign.MasterDataFeignController;

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
    private MasterDataFeignController masterDataFeignController;
    @Value("${springdoc.swagger-ui.enabled}")
    private String version;

    @GetMapping("/get")
    public String get() {
        return version;
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello world By TEC";
    }

    @GetMapping("/tec")
    public String helloTec() {
        return masterDataFeignController.hello();
    }
}
