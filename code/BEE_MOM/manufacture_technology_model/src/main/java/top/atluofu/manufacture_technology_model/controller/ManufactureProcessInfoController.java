package top.atluofu.manufacture_technology_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_technology_model.po.ManufactureProcessInfoPO;
import top.atluofu.manufacture_technology_model.service.ManufactureProcessInfoService;

import java.io.Serializable;
import java.util.List;

/**
 * (ManufactureProcessInfo)表控制层
 *
 * @author atluofu
 * @since 2023-10-30 22:55:12
 */
@Tag(name = "ManufactureProcessInfoController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("manufactureProcessInfo")
public class ManufactureProcessInfoController {
    /**
     * 服务对象
     */
    private final ManufactureProcessInfoService manufactureProcessInfoService;

    ManufactureProcessInfoController(ManufactureProcessInfoService manufactureProcessInfoService) {
        this.manufactureProcessInfoService = manufactureProcessInfoService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                   分页对象
     * @param manufactureProcessInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ManufactureProcessInfoPO> page, ManufactureProcessInfoPO manufactureProcessInfo) {
        return ResultUtils.success(this.manufactureProcessInfoService.page(page, new QueryWrapper<>(manufactureProcessInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.manufactureProcessInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param manufactureProcessInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ManufactureProcessInfoPO manufactureProcessInfo) {
        return ResultUtils.success(this.manufactureProcessInfoService.save(manufactureProcessInfo));
    }

    /**
     * 修改数据
     *
     * @param manufactureProcessInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ManufactureProcessInfoPO manufactureProcessInfo) {
        return ResultUtils.success(this.manufactureProcessInfoService.updateById(manufactureProcessInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.manufactureProcessInfoService.removeByIds(idList));
    }
}

