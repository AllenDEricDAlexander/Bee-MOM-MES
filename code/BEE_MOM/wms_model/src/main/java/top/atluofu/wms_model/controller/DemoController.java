package top.atluofu.wms_model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.atluofu.wms_model.feign.MasterDataFeignController;

/**
 * @ClassName: DemoController
 * @description: DemoController
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-15Day-12:00
 * @Version: 1.0
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    @Autowired
    private MasterDataFeignController masterDataFeignController;

    @GetMapping("/hello")
    public String hello() {
        return "hello world By QA_MODEL";
    }

    @GetMapping("/tec")
    public String helloTec() {
        return masterDataFeignController.hello();
    }

    @GetMapping("/toAll")
    public String toAll() {
        return "hello my sir";
    }

}
