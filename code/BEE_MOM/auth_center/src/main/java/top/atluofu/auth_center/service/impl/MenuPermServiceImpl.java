package top.atluofu.auth_center.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.atluofu.auth_center.dao.MenuPermMapper;
import top.atluofu.auth_center.domain.MenuPerm;
import top.atluofu.auth_center.service.IMenuPermService;

/**
 * 菜单-权限 实现类
 *
 * @author zqd
 *
 * @date 2023-07-06 14:58:01
 */
@Service
public class MenuPermServiceImpl extends ServiceImpl<MenuPermMapper, MenuPerm> implements IMenuPermService {

}
