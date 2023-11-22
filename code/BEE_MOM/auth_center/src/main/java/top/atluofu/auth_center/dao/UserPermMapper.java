package top.atluofu.auth_center.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.atluofu.auth_center.domain.UserPerm;

/**
 *  用户-权限 Mapper 接口
 *
 * @author zqd
 *
 * @date 2023-07-06 14:59:04
 */
@Mapper
public interface UserPermMapper extends BaseMapper<UserPerm> {

}
