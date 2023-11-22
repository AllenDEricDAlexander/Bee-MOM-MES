package top.atluofu.auth_center.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.atluofu.auth_center.dao.UserPermMapper;
import top.atluofu.auth_center.domain.UserPerm;
import top.atluofu.auth_center.service.IUserPermService;

/**
 * 用户-权限 实现类
 *
 * @author zqd
 *
 * @date 2023-07-06 14:59:04
 */
@Service
public class UserPermServiceImpl extends ServiceImpl<UserPermMapper, UserPerm> implements IUserPermService {

}
