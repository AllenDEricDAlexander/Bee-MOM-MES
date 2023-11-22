package top.atluofu.auth_center.controller.system;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import top.atluofu.auth_center.domain.Menu;
import top.atluofu.auth_center.domain.MenuPerm;
import top.atluofu.auth_center.domain.MenuRole;
import top.atluofu.auth_center.service.IMenuPermService;
import top.atluofu.auth_center.service.IMenuRoleService;
import top.atluofu.auth_center.service.IMenuService;
import top.atluofu.auth_center.vo.AuthRolePermVO;
import top.atluofu.common.result.ResultUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Tag(name = "菜单")
@RestController
public class MenuController {

    @Autowired
    IMenuService menuService;

    @Autowired
    IMenuRoleService menuRoleService;

    @Autowired
    IMenuPermService menuPermService;

    @Parameters({
            @Parameter(name = "currentPage",description = "页码",required = true,in = ParameterIn.QUERY),
            @Parameter(name = "pageSize",description = "每页条数",required = true,in = ParameterIn.QUERY),
            @Parameter(name = "startTime",description = "开始时间：格式yyyy-mm-dd",required = false,in = ParameterIn.QUERY),
            @Parameter(name = "endTime",description = "结束时间：格式yyyy-mm-dd",required = false,in = ParameterIn.QUERY),
            @Parameter(name = "parendId",description = "父菜单",required = false,in = ParameterIn.QUERY),
    })
    @Operation(summary = "菜单分页查询")
    @GetMapping("/menu/page")
    public ResultUtils page(
            @RequestParam(name = "currentPage", defaultValue = "1") Long currentPage,
            @RequestParam(name = "pageSize", defaultValue = "10") Long pageSize,
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date startTime,
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime,
            Long parendId) {

        QueryWrapper<Menu> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("m.updateTime");
        wrapper.eq("m.deleteStatus",1);
        if (ObjUtil.isNotEmpty(startTime) && ObjUtil.isNotEmpty(endTime)) {
            wrapper.ge("m.updateTime", startTime);
            wrapper.le("m.updateTime", endTime);
        }

        if (ObjUtil.isNotNull(parendId)) {
            wrapper.eq("m.parent_id", parendId);
        }
        return ResultUtils.success(menuService.listPage(new Page<>(currentPage, pageSize), wrapper));
    }

    @Operation(summary = "新增菜单",description = "新增或者更新菜单")
    @PostMapping("/menu/saveOrUpdate")
    public ResultUtils saveOrUpdate(@RequestBody Menu menu) {
        return ResultUtils.success(menuService.saveOrUpdate(menu));
    }

    @Operation(summary = "删除菜单",description = "根据ID删除菜单")
    @PostMapping("/menu/delById")
    public ResultUtils delById(@RequestBody Menu menu) {
        return ResultUtils.success(menuService.removeById(menu.getId()));
    }

    @Operation(summary = "批量删除",description = "根据ID批量删除菜单")
    @PostMapping("/menu/removeBatchByIds")
    public ResultUtils removeBatchByIds(@RequestBody List<Long> ids) {
        return ResultUtils.success(menuService.removeBatchByIds(ids));
    }

    @Operation(summary = "查询菜单",description = "根据ID查询菜单")
    @GetMapping("/menu/getById")
    public ResultUtils getById(Long id) {
        return ResultUtils.success(menuService.getById(id));
    }

    @Parameters({
            @Parameter(name = "type",description = "菜单类型",required = false,in = ParameterIn.QUERY),
            @Parameter(name = "pageSize",description = "每页条数",required = true,in = ParameterIn.QUERY),
            @Parameter(name = "startTime",description = "开始时间：格式yyyy-mm-dd",required = false,in = ParameterIn.QUERY),
            @Parameter(name = "endTime",description = "结束时间：格式yyyy-mm-dd",required = false,in = ParameterIn.QUERY),
            @Parameter(name = "parendId",description = "父菜单",required = false,in = ParameterIn.QUERY),
    })
    @Operation(summary = "查询菜单",description = "查询所有菜单")
    @GetMapping("/menu/getMenuList")
    public ResultUtils getMenuList(String types) {
        QueryWrapper<Menu> queryWrapper = new QueryWrapper<>();
        if(types!=null){
            queryWrapper.in("type",types.split(","));
        }
        List<Menu> list = menuService.list(queryWrapper);

        Menu root = new Menu();
        root.setId(0L);
        root.setTitle("顶级菜单");
        root.setIcon("ic:outline-home");
        list.add(0,root);

        return ResultUtils.success(list);
    }

    @Operation(summary = "菜单授权",description = "菜单授权")
    @PostMapping("/menu/saveAuth")
    public ResultUtils saveAuth(@RequestBody AuthRolePermVO menuRolePerm){
        if(ObjUtil.isNotNull(menuRolePerm) && menuRolePerm.getId()!=null) {
            menuRoleService.remove(new QueryWrapper<MenuRole>().eq("menu_id", menuRolePerm.getId()));
            menuPermService.remove(new QueryWrapper<MenuPerm>().eq("menu_id",menuRolePerm.getId()));

            if(ObjUtil.isNotNull(menuRolePerm) && CollUtil.isNotEmpty(menuRolePerm.getRoles())){
                List<MenuRole> menuRoles = new ArrayList<>();
                for (Long roleId : menuRolePerm.getRoles()) {
                    MenuRole menuRole = new MenuRole();
                    menuRole.setMenuId(menuRolePerm.getId());
                    menuRole.setRoleId(roleId);
                    menuRoles.add(menuRole);
                }
                menuRoleService.saveBatch(menuRoles);
            }

            if(ObjUtil.isNotNull(menuRolePerm) && CollUtil.isNotEmpty(menuRolePerm.getPerms())){
                List<MenuPerm> menuPerms = new ArrayList<>();
                for (Long permId : menuRolePerm.getPerms()) {
                    MenuPerm menuPerm = new MenuPerm();
                    menuPerm.setMenuId(menuRolePerm.getId());
                    menuPerm.setPermId(permId);
                    menuPerms.add(menuPerm);
                }
                menuPermService.saveBatch(menuPerms);
            }

        }
        return ResultUtils.success("success");
    }

}
