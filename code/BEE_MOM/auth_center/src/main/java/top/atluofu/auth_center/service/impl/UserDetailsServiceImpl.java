package top.atluofu.auth_center.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import top.atluofu.auth_center.dao.MenuMapper;
import top.atluofu.auth_center.dao.UserMapper;
import top.atluofu.auth_center.domain.LoginUser;
import top.atluofu.auth_center.domain.User;

import java.util.List;
import java.util.Objects;

/**
 * 三大步 1.UsernamePasswordAuthenticationFilter
 * 负责处理我们在登录页面填写了用户名密码后的登录请求，入门案例的认证工作主要由它负责
 * <p>
 * 2.ExceptionTranslationFilter
 * 处理过滤器中抛出的任何AccessDeniedException和AuthenticationException ——捕获过程中出现的异常
 * <p>
 * 3.FilterSecuritylnterceptor
 * 负责权限校验的过滤器
 * <p>
 * SpringSecurity
 * 自己接管最后三步，查询信息 并 返回对象
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //查询用户信息
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername, username);
        User user = userMapper.selectOne(queryWrapper);
        //判断user是否为空
        if (Objects.isNull(user)) {
            //为空直接抛出异常 不用担心 SpringSecurity有异常内置捕获器
            throw new RuntimeException("用户名或密码错误！");
        }
        List<String> list = menuMapper.selectPermsByUserId(user.getId());
        return new LoginUser(user, list);
    }
}
