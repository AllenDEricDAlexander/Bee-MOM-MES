package top.atluofu.manufacture_technology_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_technology_model.po.ManufactureTechnologyInfoPO;
import top.atluofu.manufacture_technology_model.service.ManufactureTechnologyInfoService;

import java.io.Serializable;
import java.util.List;

/**
 * (ManufactureTechnologyInfo)表控制层
 *
 * @author atluofu
 * @since 2023-10-30 22:55:12
 */
@Tag(name = "ManufactureTechnologyInfoController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("manufactureTechnologyInfo")
public class ManufactureTechnologyInfoController {
    /**
     * 服务对象
     */
    private final ManufactureTechnologyInfoService manufactureTechnologyInfoService;

    ManufactureTechnologyInfoController(ManufactureTechnologyInfoService manufactureTechnologyInfoService) {
        this.manufactureTechnologyInfoService = manufactureTechnologyInfoService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                      分页对象
     * @param manufactureTechnologyInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ManufactureTechnologyInfoPO> page, ManufactureTechnologyInfoPO manufactureTechnologyInfo) {
        return ResultUtils.success(this.manufactureTechnologyInfoService.page(page, new QueryWrapper<>(manufactureTechnologyInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.manufactureTechnologyInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param manufactureTechnologyInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ManufactureTechnologyInfoPO manufactureTechnologyInfo) {
        return ResultUtils.success(this.manufactureTechnologyInfoService.save(manufactureTechnologyInfo));
    }

    /**
     * 修改数据
     *
     * @param manufactureTechnologyInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ManufactureTechnologyInfoPO manufactureTechnologyInfo) {
        return ResultUtils.success(this.manufactureTechnologyInfoService.updateById(manufactureTechnologyInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.manufactureTechnologyInfoService.removeByIds(idList));
    }
}

