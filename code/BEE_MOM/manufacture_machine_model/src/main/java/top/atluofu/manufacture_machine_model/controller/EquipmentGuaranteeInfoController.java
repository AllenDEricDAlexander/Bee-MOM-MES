package top.atluofu.manufacture_machine_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_machine_model.po.EquipmentGuaranteeInfoPO;
import top.atluofu.manufacture_machine_model.service.EquipmentGuaranteeInfoService;

import java.io.Serializable;
import java.util.List;

/**
 * (EquipmentGuaranteeInfo)表控制层
 *
 * @author atluofu
 * @since 2023-11-01 21:38:00
 */
@Tag(name = "EquipmentGuaranteeInfoController")
@RestController
@Slf4j
@Validated
@RequestMapping("equipmentGuaranteeInfo")
public class EquipmentGuaranteeInfoController {
    /**
     * 服务对象
     */
    private final EquipmentGuaranteeInfoService equipmentGuaranteeInfoService;

    EquipmentGuaranteeInfoController(EquipmentGuaranteeInfoService equipmentGuaranteeInfoService) {
        this.equipmentGuaranteeInfoService = equipmentGuaranteeInfoService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                   分页对象
     * @param equipmentGuaranteeInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<EquipmentGuaranteeInfoPO> page, EquipmentGuaranteeInfoPO equipmentGuaranteeInfo) {
        return ResultUtils.success(this.equipmentGuaranteeInfoService.page(page, new QueryWrapper<>(equipmentGuaranteeInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.equipmentGuaranteeInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param equipmentGuaranteeInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody EquipmentGuaranteeInfoPO equipmentGuaranteeInfo) {
        return ResultUtils.success(this.equipmentGuaranteeInfoService.save(equipmentGuaranteeInfo));
    }

    /**
     * 修改数据
     *
     * @param equipmentGuaranteeInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody EquipmentGuaranteeInfoPO equipmentGuaranteeInfo) {
        return ResultUtils.success(this.equipmentGuaranteeInfoService.updateById(equipmentGuaranteeInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.equipmentGuaranteeInfoService.removeByIds(idList));
    }
}

