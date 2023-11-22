package top.atluofu.auth_center.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.atluofu.auth_center.dao.UserRoleMapper;
import top.atluofu.auth_center.domain.UserRole;
import top.atluofu.auth_center.service.IUserRoleService;

/**
 * 用户-角色 实现类
 *
 * @author zqd
 *
 * @date 2023-07-06 14:59:21
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
