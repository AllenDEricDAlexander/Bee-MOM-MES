package top.atluofu.auth_center.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.userdetails.UserDetailsService;
import top.atluofu.auth_center.domain.User;

/**
 * 用户 服务类
 *
 * @author zqd
 *
 * @date 2023-07-05 13:47:14
 */
public interface IUserService extends IService<User>, UserDetailsService {
    IPage<User> listPage(IPage<User> page, @Param(Constants.WRAPPER) Wrapper<User> queryWrapper);
}
