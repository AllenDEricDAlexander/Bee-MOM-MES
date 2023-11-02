package top.atluofu.manufacture_machine_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_machine_model.po.ManufactureMachineTypePO;
import top.atluofu.manufacture_machine_model.service.ManufactureMachineTypeService;

import java.io.Serializable;
import java.util.List;

/**
 * (ManufactureMachineType)表控制层
 *
 * @author atluofu
 * @since 2023-11-01 21:38:02
 */
@Tag(name = "ManufactureMachineTypeController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("manufactureMachineType")
public class ManufactureMachineTypeController {
    /**
     * 服务对象
     */
    private final ManufactureMachineTypeService manufactureMachineTypeService;

    ManufactureMachineTypeController(ManufactureMachineTypeService manufactureMachineTypeService) {
        this.manufactureMachineTypeService = manufactureMachineTypeService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                   分页对象
     * @param manufactureMachineType 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ManufactureMachineTypePO> page, ManufactureMachineTypePO manufactureMachineType) {
        return ResultUtils.success(this.manufactureMachineTypeService.page(page, new QueryWrapper<>(manufactureMachineType)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.manufactureMachineTypeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param manufactureMachineType 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ManufactureMachineTypePO manufactureMachineType) {
        return ResultUtils.success(this.manufactureMachineTypeService.save(manufactureMachineType));
    }

    /**
     * 修改数据
     *
     * @param manufactureMachineType 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ManufactureMachineTypePO manufactureMachineType) {
        return ResultUtils.success(this.manufactureMachineTypeService.updateById(manufactureMachineType));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.manufactureMachineTypeService.removeByIds(idList));
    }
}

