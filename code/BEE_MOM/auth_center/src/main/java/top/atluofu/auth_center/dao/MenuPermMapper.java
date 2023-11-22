package top.atluofu.auth_center.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.atluofu.auth_center.domain.MenuPerm;

/**
 *  菜单-权限 Mapper 接口
 *
 * @author zqd
 *
 * @date 2023-07-06 14:58:01
 */
@Mapper
public interface MenuPermMapper extends BaseMapper<MenuPerm> {

}
