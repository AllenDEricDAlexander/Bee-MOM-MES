package top.atluofu.auth_center.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.atluofu.auth_center.dao.MenuMapper;
import top.atluofu.auth_center.domain.Menu;
import top.atluofu.auth_center.service.IMenuService;

import java.util.List;

/**
 * 菜单 实现类
 *
 * @author zqd
 *
 * @date 2023-07-05 11:14:24
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> listMenu(Wrapper wrapper) {
        return menuMapper.listMenu(wrapper);
    }

    @Override
    public IPage<Menu> listPage(IPage<Menu> page, Wrapper<Menu> queryWrapper) {
        return menuMapper.listPage(page, queryWrapper);
    }
}
