package top.atluofu.bee_mom.service.impl;

import top.atluofu.bee_mom.common.service.BaseServiceImpl;
import top.atluofu.bee_mom.dao.UsersDao;
import top.atluofu.bee_mom.entity.Users;
import top.atluofu.bee_mom.service.UsersService;
import org.springframework.stereotype.Service;

/**
 * (Users)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-23 17:39:54
 */
@Service("usersService")
public class UsersServiceImpl extends BaseServiceImpl<UsersDao, Users> implements UsersService {

}

