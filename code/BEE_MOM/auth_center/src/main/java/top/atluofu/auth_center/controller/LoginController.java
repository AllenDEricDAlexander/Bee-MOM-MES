package top.atluofu.auth_center.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.atluofu.auth_center.domain.User;
import top.atluofu.auth_center.service.LoginService;
import top.atluofu.common.result.ResultUtils;

/**
 * SpringSecurity接管第一步 认证
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/user/login")
    public ResultUtils login(@RequestBody User user) {
        return loginService.login(user);
    }

    @RequestMapping("/user/logout")
    public ResultUtils logout() {
        return loginService.logout();
    }

}
