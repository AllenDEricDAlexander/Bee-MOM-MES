package top.atluofu.auth_center.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import top.atluofu.auth_center.dao.UserMapper;
import top.atluofu.auth_center.domain.Role;
import top.atluofu.auth_center.domain.User;
import top.atluofu.auth_center.service.IUserService;

import java.util.stream.Collectors;

/**
 * 用户 实现类
 *
 * @author zqd
 * @date 2023-07-05 13:47:14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userMapper.getByUsername(username);

        if (ObjectUtil.isNull(user)) {
            throw new UsernameNotFoundException("用户未找到");
        }

        //将数据库中的角色拆分成SpringSecurity结构
        String roles = user.getRoles().stream().map(Role::getTag).collect(Collectors.joining(","));

        user.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList(roles));

        return user;
    }

    @Override
    public IPage<User> listPage(IPage<User> page, Wrapper<User> queryWrapper) {
        return userMapper.listPage(page, queryWrapper);
    }
}
