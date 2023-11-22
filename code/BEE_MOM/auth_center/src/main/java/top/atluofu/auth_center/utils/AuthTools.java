package top.atluofu.auth_center.utils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.atluofu.auth_center.domain.Menu;
import top.atluofu.auth_center.domain.Perm;
import top.atluofu.auth_center.service.IMenuService;
import top.atluofu.auth_center.service.IPermService;
import top.atluofu.auth_center.vo.MenuPermTreeVO;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class AuthTools {

    @Autowired
    IMenuService menuService;

    @Autowired
    IPermService permService;

    public List<MenuPermTreeVO> getMenuPerms(){

        List<Menu> menus = menuService.list(new QueryWrapper<Menu>().ne("type",2));

        List<Perm> perms = permService.list();

        List<MenuPermTreeVO> menuPerms = new ArrayList<>();

        for (Menu menu : menus) {
            for (Perm perm : perms) {
                if(perm.getMenuId().equals(menu.getId())){
                    MenuPermTreeVO menuPerm = new MenuPermTreeVO();
                    menuPerm.setId(perm.getId());
                    menuPerm.setName(perm.getName()+":"+perm.getTag());
                    menuPerm.setParentId(perm.getMenuId()+10000);
                    menuPerms.add(menuPerm);
                }else{
                    MenuPermTreeVO menuPerm = new MenuPermTreeVO();
                    //防止和perm的id冲突
                    menuPerm.setId(menu.getId()+10000);
                    menuPerm.setName(menu.getTitle());
                    menuPerm.setParentId(menu.getParentId()+10000);
                    menuPerm.setDisabled(true);
                    menuPerms.add(menuPerm);
                }
            }
        }
        Set<MenuPermTreeVO> menuPermVOSet = new TreeSet<>(Comparator.comparing(MenuPermTreeVO::getId));

        menuPermVOSet.addAll(menuPerms);

        return menuPermVOSet.stream().collect(Collectors.toList());
    }

}
