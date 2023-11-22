package top.atluofu.auth_center.controller.system;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.atluofu.auth_center.domain.*;
import top.atluofu.auth_center.service.*;
import top.atluofu.auth_center.utils.Asserts;
import top.atluofu.common.result.ResultUtils;

@Tag(name = "注册")
@RestController
public class RegisterController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    IUserService userService;

    @Autowired
    IRoleService roleService;

    @Autowired
    IUserRoleService userRoleService;

    @Autowired
    IPermService permService;

    @Autowired
    IUserPermService userPermService;

    @PostMapping("/register")
    public ResultUtils register(@RequestBody User user, HttpServletRequest request){
        User queryUser = userService.getOne(new QueryWrapper<User>().eq("username", user.getUsername()));

        Asserts.isNotNull(queryUser,"用户已存在!");

        String newPassword = passwordEncoder.encode(user.getPassword());

        user.setPassword(newPassword);
        user.setNickname(user.getUsername());

        user.setEnabled(true);

        userService.save(user);

        Role role = roleService.getOne(new QueryWrapper<Role>().eq("tag", "admin"));

        UserRole userRole = new UserRole();
        userRole.setUserId(user.getId());
        userRole.setRoleId(role.getId());
        userRoleService.save(userRole);

        Perm perm = permService.getOne(new QueryWrapper<Perm>().eq("tag", "perm_all"));

        UserPerm userPerm = new UserPerm();
        userPerm.setUserId(user.getId());
        userPerm.setPermId(perm.getId());

        userPermService.save(userPerm);

        return ResultUtils.success("success");
    }

}
