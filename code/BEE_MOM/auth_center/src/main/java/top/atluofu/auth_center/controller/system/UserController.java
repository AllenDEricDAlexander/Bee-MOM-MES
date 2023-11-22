package top.atluofu.auth_center.controller.system;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import top.atluofu.auth_center.domain.User;
import top.atluofu.auth_center.domain.UserPerm;
import top.atluofu.auth_center.domain.UserRole;
import top.atluofu.auth_center.service.IUserPermService;
import top.atluofu.auth_center.service.IUserRoleService;
import top.atluofu.auth_center.service.IUserService;
import top.atluofu.auth_center.utils.DateUtils;
import top.atluofu.auth_center.utils.JwtUtils;
import top.atluofu.auth_center.vo.AuthRolePermVO;
import top.atluofu.common.result.ResultUtils;

import java.util.*;

@Tag(name = "用户")
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @Autowired
    IUserRoleService userRoleService;

    @Autowired
    IUserPermService userPermService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Parameters({
            @Parameter(name = "currentPage", description = "页码", required = true, in = ParameterIn.QUERY),
            @Parameter(name = "pageSize", description = "每页条数", required = true, in = ParameterIn.QUERY),
            @Parameter(name = "startTime", description = "开始时间：格式yyyy-mm-dd", required = false, in = ParameterIn.QUERY),
            @Parameter(name = "endTime", description = "结束时间：格式yyyy-mm-dd", required = false, in = ParameterIn.QUERY),
            @Parameter(name = "username", description = "用户名", required = false, in = ParameterIn.QUERY),
            @Parameter(name = "mobile", description = "手机号", required = false, in = ParameterIn.QUERY),
            @Parameter(name = "enabled", description = "状态", required = false, in = ParameterIn.QUERY),
    })
    @Operation(summary = "用户分页查询")
    @GetMapping("/user/page")
    public ResultUtils page(
            @RequestParam(name = "currentPage", defaultValue = "1") Long currentPage,
            @RequestParam(name = "pageSize", defaultValue = "10") Long pageSize,
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date startTime,
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime,
            String username,
            String mobile,
            Boolean enabled, Long deptId) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("u.createTime");

        if (ObjUtil.isNotEmpty(startTime) && ObjUtil.isNotEmpty(endTime)) {
            queryWrapper.ge("u.createTime", startTime);
            queryWrapper.le("u.createTime", endTime);
        }

        if (StrUtil.isNotBlank(username)) {
            queryWrapper.like("u.username", username.trim());
        }

        if (StrUtil.isNotBlank(mobile)) {
            queryWrapper.like("u.mobile", mobile);
        }

        if (ObjUtil.isNotNull(enabled)) {
            queryWrapper.eq("u.enabled", enabled);
        }

        if (ObjUtil.isNotNull(deptId)) {
            queryWrapper.eq("u.dept_id", deptId);
        }

        queryWrapper.eq("u.deleteStatus", 1);

        IPage<User> page = userService.listPage(new Page<User>(currentPage, pageSize), queryWrapper);

        return ResultUtils.success(page);
    }


    @Operation(summary = "新增用户", description = "新增或者更新用户")
    @PostMapping("/user/saveOrUpdate")
    public ResultUtils saveOrUpdate(@RequestBody User user) {
        String newPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(newPassword);

        return ResultUtils.success(userService.saveOrUpdate(user));
    }

    @Operation(summary = "删除用户", description = "根据ID删除用户")
    @PostMapping("/user/delById")
    public ResultUtils delById(@RequestBody User user) {
        return ResultUtils.success(userService.removeById(user.getId()));
    }

    @Operation(summary = "ReSetPassword", description = "重置密码")
    @PostMapping("/user/ReSetPassword")
    public ResultUtils ReSetPassword(@RequestBody User user) {
        String newPassword = passwordEncoder.encode("test123456");

        userService.update(new UpdateWrapper<User>().set("password", newPassword).eq("id", user.getId()));

        return ResultUtils.success("");
    }

    @Operation(summary = "查询用户", description = "根据ID查询用户")
    @GetMapping("/user/getById")
    public ResultUtils getById(Long id) {
        return ResultUtils.success(userService.getById(id));
    }

    @Operation(summary = "刷新token", description = "根据旧的token生成新的token,过期时间延迟")
    @PostMapping("/user/refreshToken")
    public ResultUtils refreshToken(@RequestBody String token) {
        String refreshToken = JwtUtils.refreshToken(JSONUtil.parse(token).getByPath("token").toString());
        String accessToken = refreshToken;

        Map<String, Object> data = new HashMap<>();
        data.put("accessToken", accessToken);
        data.put("refreshToken", refreshToken);
        data.put("expires", DateUtils.format(DateUtils.addDay(30)));

        return ResultUtils.success(data);
    }

    @Operation(summary = "批量删除", description = "根据ID批量删除")
    @PostMapping("/user/removeBatchByIds")
    public ResultUtils removeBatchByIds(@RequestBody List<Long> ids) {
        return ResultUtils.success(userService.removeBatchByIds(ids));
    }

    @Operation(summary = "用户授权", description = "用户授权")
    @PostMapping("/user/saveAuth")
    public ResultUtils saveAuth(@RequestBody AuthRolePermVO userRolePerm) {
        if (ObjUtil.isNotNull(userRolePerm) && userRolePerm.getId() != null) {

            userRoleService.remove(new QueryWrapper<UserRole>().eq("user_id", userRolePerm.getId()));
            userPermService.remove(new QueryWrapper<UserPerm>().eq("user_id", userRolePerm.getId()));

            if (ObjUtil.isNotNull(userRolePerm) && CollUtil.isNotEmpty(userRolePerm.getRoles())) {
                List<UserRole> userRoles = new ArrayList<>();
                for (Long roleId : userRolePerm.getRoles()) {
                    UserRole userRole = new UserRole();
                    userRole.setUserId(userRolePerm.getId());
                    userRole.setRoleId(roleId);
                    userRoles.add(userRole);
                }
                userRoleService.saveBatch(userRoles);
            }

            if (ObjUtil.isNotNull(userRolePerm) && CollUtil.isNotEmpty(userRolePerm.getPerms())) {
                List<UserPerm> userPerms = new ArrayList<>();
                for (Long permId : userRolePerm.getPerms()) {
                    UserPerm userPerm = new UserPerm();
                    userPerm.setUserId(userRolePerm.getId());
                    userPerm.setPermId(permId);
                    userPerms.add(userPerm);
                }
                userPermService.saveBatch(userPerms);
            }

        }
        return ResultUtils.success("");
    }
}
