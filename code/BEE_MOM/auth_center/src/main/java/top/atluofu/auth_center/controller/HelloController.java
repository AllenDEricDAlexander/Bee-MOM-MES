package top.atluofu.auth_center.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.atluofu.common.result.ResultUtils;

/**
 * @author MQa010225
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    @PreAuthorize("@ex.hasAuthority('system:dept:list')")
    public String hello() {
        return "hello";
    }


    @RequestMapping("/testCors")
    public ResultUtils testCors() {
        return ResultUtils.result(200, "testCors测试接口", null);
    }

}
