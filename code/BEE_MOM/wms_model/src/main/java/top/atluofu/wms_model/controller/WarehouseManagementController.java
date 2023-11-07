package top.atluofu.wms_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.wms_model.po.WarehouseManagementPO;
import top.atluofu.wms_model.service.WarehouseManagementService;

import java.io.Serializable;
import java.util.List;

/**
 * (WarehouseManagement)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:56:05
 */
@Tag(name = "WarehouseManagementController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("warehouseManagement")
public class WarehouseManagementController {
    /**
     * 服务对象
     */
    private final WarehouseManagementService warehouseManagementService;

    WarehouseManagementController(WarehouseManagementService warehouseManagementService) {
        this.warehouseManagementService = warehouseManagementService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                分页对象
     * @param warehouseManagement 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<WarehouseManagementPO> page, WarehouseManagementPO warehouseManagement) {
        return ResultUtils.success(this.warehouseManagementService.page(page, new QueryWrapper<>(warehouseManagement)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.warehouseManagementService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param warehouseManagement 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody WarehouseManagementPO warehouseManagement) {
        return ResultUtils.success(this.warehouseManagementService.save(warehouseManagement));
    }

    /**
     * 修改数据
     *
     * @param warehouseManagement 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody WarehouseManagementPO warehouseManagement) {
        return ResultUtils.success(this.warehouseManagementService.updateById(warehouseManagement));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.warehouseManagementService.removeByIds(idList));
    }
}

