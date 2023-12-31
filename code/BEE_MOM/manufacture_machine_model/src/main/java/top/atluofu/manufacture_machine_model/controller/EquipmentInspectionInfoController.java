package top.atluofu.manufacture_machine_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_machine_model.po.EquipmentInspectionInfoPO;
import top.atluofu.manufacture_machine_model.service.EquipmentInspectionInfoService;

import java.io.Serializable;
import java.util.List;

/**
 * (EquipmentInspectionInfo)表控制层
 *
 * @author atluofu
 * @since 2023-11-01 21:38:01
 */
@Tag(name = "EquipmentInspectionInfoController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("equipmentInspectionInfo")
public class EquipmentInspectionInfoController {
    /**
     * 服务对象
     */
    private final EquipmentInspectionInfoService equipmentInspectionInfoService;

    EquipmentInspectionInfoController(EquipmentInspectionInfoService equipmentInspectionInfoService) {
        this.equipmentInspectionInfoService = equipmentInspectionInfoService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                    分页对象
     * @param equipmentInspectionInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<EquipmentInspectionInfoPO> page, EquipmentInspectionInfoPO equipmentInspectionInfo) {
        return ResultUtils.success(this.equipmentInspectionInfoService.page(page, new QueryWrapper<>(equipmentInspectionInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.equipmentInspectionInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param equipmentInspectionInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody EquipmentInspectionInfoPO equipmentInspectionInfo) {
        return ResultUtils.success(this.equipmentInspectionInfoService.save(equipmentInspectionInfo));
    }

    /**
     * 修改数据
     *
     * @param equipmentInspectionInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody EquipmentInspectionInfoPO equipmentInspectionInfo) {
        return ResultUtils.success(this.equipmentInspectionInfoService.updateById(equipmentInspectionInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.equipmentInspectionInfoService.removeByIds(idList));
    }
}

