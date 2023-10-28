package top.atluofu.manufacture_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_model.po.ManufactureDispatchePO;
import top.atluofu.manufacture_model.service.ManufactureDispatcheService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (ManufactureDispatche)表控制层
 *
 * @author atluofu
 * @since 2023-10-28 13:36:17
 */
@Api(tags = "ManufactureDispatcheController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("manufactureDispatche")
public class ManufactureDispatcheController {
    /**
     * 服务对象
     */
    private final ManufactureDispatcheService manufactureDispatcheService;

    ManufactureDispatcheController(ManufactureDispatcheService manufactureDispatcheService) {
        this.manufactureDispatcheService = manufactureDispatcheService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                 分页对象
     * @param manufactureDispatche 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ManufactureDispatchePO> page, ManufactureDispatchePO manufactureDispatche) {
        return ResultUtils.success(this.manufactureDispatcheService.page(page, new QueryWrapper<>(manufactureDispatche)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.manufactureDispatcheService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param manufactureDispatche 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ManufactureDispatchePO manufactureDispatche) {
        return ResultUtils.success(this.manufactureDispatcheService.save(manufactureDispatche));
    }

    /**
     * 修改数据
     *
     * @param manufactureDispatche 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ManufactureDispatchePO manufactureDispatche) {
        return ResultUtils.success(this.manufactureDispatcheService.updateById(manufactureDispatche));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.manufactureDispatcheService.removeByIds(idList));
    }
}

