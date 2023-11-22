package top.atluofu.auth_center.controller.system;

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
import top.atluofu.auth_center.domain.Perm;
import top.atluofu.auth_center.service.IPermService;
import top.atluofu.auth_center.utils.AuthTools;
import top.atluofu.common.result.ResultUtils;

import java.util.Date;
import java.util.List;

@Tag(name = "用户权限")
@RestController
public class PermController {

    @Autowired
    private IPermService permService;

    @Autowired
    private AuthTools authTools;

    @Parameters({
            @Parameter(name = "currentPage",description = "页码",required = true,in = ParameterIn.QUERY),
            @Parameter(name = "pageSize",description = "每页条数",required = true,in = ParameterIn.QUERY),
            @Parameter(name = "startTime",description = "开始时间：格式yyyy-mm-dd",required = false,in = ParameterIn.QUERY),
            @Parameter(name = "endTime",description = "结束时间：格式yyyy-mm-dd",required = false,in = ParameterIn.QUERY),
    })
    @Operation(summary = "用户权限分页查询")
    @GetMapping("/perm/page")
    public ResultUtils page(
            @RequestParam(name = "currentPage",defaultValue = "1") Long currentPage,
            @RequestParam(name = "pageSize",defaultValue = "10") Long pageSize,
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date startTime,
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime){

        QueryWrapper<Perm> wrapper = new QueryWrapper<>();

        if(ObjUtil.isNotEmpty(startTime) && ObjUtil.isNotEmpty(endTime)){
            wrapper.ge("m.updateTime",startTime);
            wrapper.le("m.updateTime",endTime);
        }
        wrapper.eq("p.deleteStatus",1);
        wrapper.orderByDesc("p.updateTime");
        return ResultUtils.success(permService.listPage(new Page<>(currentPage, pageSize), wrapper));
    }

    @Operation(summary = "新增用户权限",description = "新增或者更新用户权限")
    @PostMapping("/perm/saveOrUpdate")
    public ResultUtils saveOrUpdate(@RequestBody Perm perm){
        return ResultUtils.success(permService.saveOrUpdate(perm));
    }

    @Operation(summary = "删除用户权限",description = "根据ID删除用户权限")
    @PostMapping("/perm/delById")
    public ResultUtils delById(@RequestBody Perm perm){
        return ResultUtils.success(permService.removeById(perm.getId()));
    }

    @Operation(summary = "查询用户权限",description = "根据ID查询用户权限")
    @GetMapping("/perm/getById")
    public ResultUtils getById(Long id){
        return ResultUtils.success(permService.getById(id));
    }

    @Operation(summary = "所有权限",description = "查询所有权限")
    @GetMapping("/perm/getPermList")
    public ResultUtils getPermList(){
        return ResultUtils.success(authTools.getMenuPerms());
    }

    @Operation(summary = "getSelectedPermsByMenuId",description = "根据菜单ID查询权限")
    @GetMapping("/perm/getSelectedPermsByMenuId")
    public ResultUtils getSelectedPermsByMenuId(Long menuId){
        return ResultUtils.success(permService.getSelectedPermsByMenuId(menuId));
    }

    @Operation(summary = "getSelectedPermsByUserId",description = "根据用户ID查询权限")
    @GetMapping("/perm/getSelectedPermsByUserId")
    public ResultUtils getSelectedPermsByUserId(Long userId){
        return ResultUtils.success(permService.getSelectedPermsByUserId(userId));
    }

    @Operation(summary = "批量删除",description = "根据ID批量删除")
    @PostMapping("/perm/removeBatchByIds")
    public ResultUtils removeBatchByIds(@RequestBody List<Long> ids) {
        return ResultUtils.success(permService.removeBatchByIds(ids));
    }

}
