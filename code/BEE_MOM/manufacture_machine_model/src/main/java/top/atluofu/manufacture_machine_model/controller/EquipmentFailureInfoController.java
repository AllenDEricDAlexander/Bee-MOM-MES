package top.atluofu.manufacture_machine_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_machine_model.po.EquipmentFailureInfoPO;
import top.atluofu.manufacture_machine_model.service.EquipmentFailureInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (EquipmentFailureInfo)表控制层
 *
 * @author atluofu
 * @since 2023-11-01 21:37:59
 */
@Api(tags = "EquipmentFailureInfoController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("equipmentFailureInfo")
public class EquipmentFailureInfoController {
    /**
     * 服务对象
     */
    private final EquipmentFailureInfoService equipmentFailureInfoService;

    EquipmentFailureInfoController(EquipmentFailureInfoService equipmentFailureInfoService) {
        this.equipmentFailureInfoService = equipmentFailureInfoService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                 分页对象
     * @param equipmentFailureInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<EquipmentFailureInfoPO> page, EquipmentFailureInfoPO equipmentFailureInfo) {
        return ResultUtils.success(this.equipmentFailureInfoService.page(page, new QueryWrapper<>(equipmentFailureInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.equipmentFailureInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param equipmentFailureInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody EquipmentFailureInfoPO equipmentFailureInfo) {
        return ResultUtils.success(this.equipmentFailureInfoService.save(equipmentFailureInfo));
    }

    /**
     * 修改数据
     *
     * @param equipmentFailureInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody EquipmentFailureInfoPO equipmentFailureInfo) {
        return ResultUtils.success(this.equipmentFailureInfoService.updateById(equipmentFailureInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.equipmentFailureInfoService.removeByIds(idList));
    }
}

