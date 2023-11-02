package top.atluofu.manufacture_technology_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_technology_model.po.ManufactureTechnologyModifyInfoPO;
import top.atluofu.manufacture_technology_model.service.ManufactureTechnologyModifyInfoService;

import java.io.Serializable;
import java.util.List;

/**
 * (ManufactureTechnologyModifyInfo)表控制层
 *
 * @author atluofu
 * @since 2023-10-30 22:55:13
 */
@Tag(name = "ManufactureTechnologyModifyInfoController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("manufactureTechnologyModifyInfo")
public class ManufactureTechnologyModifyInfoController {
    /**
     * 服务对象
     */
    private final ManufactureTechnologyModifyInfoService manufactureTechnologyModifyInfoService;

    ManufactureTechnologyModifyInfoController(ManufactureTechnologyModifyInfoService manufactureTechnologyModifyInfoService) {
        this.manufactureTechnologyModifyInfoService = manufactureTechnologyModifyInfoService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                            分页对象
     * @param manufactureTechnologyModifyInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ManufactureTechnologyModifyInfoPO> page, ManufactureTechnologyModifyInfoPO manufactureTechnologyModifyInfo) {
        return ResultUtils.success(this.manufactureTechnologyModifyInfoService.page(page, new QueryWrapper<>(manufactureTechnologyModifyInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.manufactureTechnologyModifyInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param manufactureTechnologyModifyInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ManufactureTechnologyModifyInfoPO manufactureTechnologyModifyInfo) {
        return ResultUtils.success(this.manufactureTechnologyModifyInfoService.save(manufactureTechnologyModifyInfo));
    }

    /**
     * 修改数据
     *
     * @param manufactureTechnologyModifyInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ManufactureTechnologyModifyInfoPO manufactureTechnologyModifyInfo) {
        return ResultUtils.success(this.manufactureTechnologyModifyInfoService.updateById(manufactureTechnologyModifyInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.manufactureTechnologyModifyInfoService.removeByIds(idList));
    }
}

