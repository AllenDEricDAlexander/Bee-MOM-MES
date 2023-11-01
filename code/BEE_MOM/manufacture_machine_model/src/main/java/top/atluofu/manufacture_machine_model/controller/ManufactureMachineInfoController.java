package top.atluofu.manufacture_machine_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_machine_model.po.ManufactureMachineInfoPO;
import top.atluofu.manufacture_machine_model.service.ManufactureMachineInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (ManufactureMachineInfo)表控制层
 *
 * @author atluofu
 * @since 2023-11-01 21:38:02
 */
@Api(tags = "ManufactureMachineInfoController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("manufactureMachineInfo")
public class ManufactureMachineInfoController {
    /**
     * 服务对象
     */
    private final ManufactureMachineInfoService manufactureMachineInfoService;

    ManufactureMachineInfoController(ManufactureMachineInfoService manufactureMachineInfoService) {
        this.manufactureMachineInfoService = manufactureMachineInfoService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                   分页对象
     * @param manufactureMachineInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ManufactureMachineInfoPO> page, ManufactureMachineInfoPO manufactureMachineInfo) {
        return ResultUtils.success(this.manufactureMachineInfoService.page(page, new QueryWrapper<>(manufactureMachineInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.manufactureMachineInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param manufactureMachineInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ManufactureMachineInfoPO manufactureMachineInfo) {
        return ResultUtils.success(this.manufactureMachineInfoService.save(manufactureMachineInfo));
    }

    /**
     * 修改数据
     *
     * @param manufactureMachineInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ManufactureMachineInfoPO manufactureMachineInfo) {
        return ResultUtils.success(this.manufactureMachineInfoService.updateById(manufactureMachineInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.manufactureMachineInfoService.removeByIds(idList));
    }
}

