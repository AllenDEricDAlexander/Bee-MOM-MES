package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.RoleDao;
import top.atluofu.master_data.entity.Role;
import top.atluofu.master_data.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * (Role)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-26 22:46:39
 */
@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<RoleDao, Role> implements RoleService {

}

