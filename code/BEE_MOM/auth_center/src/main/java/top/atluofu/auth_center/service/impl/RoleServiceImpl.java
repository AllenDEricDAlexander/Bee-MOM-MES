package top.atluofu.auth_center.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.atluofu.auth_center.dao.RoleMapper;
import top.atluofu.auth_center.domain.Role;
import top.atluofu.auth_center.service.IRoleService;

import java.util.List;

/**
 * 用户角色 实现类
 *
 * @author zqd
 *
 * @date 2023-07-05 13:47:02
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> getSelectedRolesByMenuId(Long menuId) {
        return roleMapper.getSelectedRolesByMenuId(menuId);
    }

    @Override
    public List<Role> getSelectedRolesByUserId(Long userId) {
        return roleMapper.getSelectedRolesByUserId(userId);
    }
}
