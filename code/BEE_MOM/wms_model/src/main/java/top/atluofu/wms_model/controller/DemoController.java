package top.atluofu.wms_model.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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

    @GetMapping("/druid/stat")
    public Object druidStat() {
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World By QA_MODEL";
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
