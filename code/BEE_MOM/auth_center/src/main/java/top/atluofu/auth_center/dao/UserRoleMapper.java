package top.atluofu.auth_center.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.atluofu.auth_center.domain.UserRole;

/**
 *  用户-角色 Mapper 接口
 *
 * @author zqd
 *
 * @date 2023-07-06 14:59:21
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

}
