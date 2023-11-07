package top.atluofu.wms_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.wms_model.po.CallForMaterialInfoPO;
import top.atluofu.wms_model.service.CallForMaterialInfoService;

import java.io.Serializable;
import java.util.List;

/**
 * (CallForMaterialInfo)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:56:01
 */
@Tag(name = "CallForMaterialInfoController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("callForMaterialInfo")
public class CallForMaterialInfoController {
    /**
     * 服务对象
     */
    private final CallForMaterialInfoService callForMaterialInfoService;

    CallForMaterialInfoController(CallForMaterialInfoService callForMaterialInfoService) {
        this.callForMaterialInfoService = callForMaterialInfoService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                分页对象
     * @param callForMaterialInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<CallForMaterialInfoPO> page, CallForMaterialInfoPO callForMaterialInfo) {
        return ResultUtils.success(this.callForMaterialInfoService.page(page, new QueryWrapper<>(callForMaterialInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.callForMaterialInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param callForMaterialInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody CallForMaterialInfoPO callForMaterialInfo) {
        return ResultUtils.success(this.callForMaterialInfoService.save(callForMaterialInfo));
    }

    /**
     * 修改数据
     *
     * @param callForMaterialInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody CallForMaterialInfoPO callForMaterialInfo) {
        return ResultUtils.success(this.callForMaterialInfoService.updateById(callForMaterialInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.callForMaterialInfoService.removeByIds(idList));
    }
}

