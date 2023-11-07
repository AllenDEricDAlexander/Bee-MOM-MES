package top.atluofu.wms_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.wms_model.po.SalesReturnPO;
import top.atluofu.wms_model.service.SalesReturnService;

import java.io.Serializable;
import java.util.List;

/**
 * (SalesReturn)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:56:04
 */
@Tag(name = "SalesReturnController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("salesReturn")
public class SalesReturnController {
    /**
     * 服务对象
     */
    private final SalesReturnService salesReturnService;

    SalesReturnController(SalesReturnService salesReturnService) {
        this.salesReturnService = salesReturnService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page        分页对象
     * @param salesReturn 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<SalesReturnPO> page, SalesReturnPO salesReturn) {
        return ResultUtils.success(this.salesReturnService.page(page, new QueryWrapper<>(salesReturn)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.salesReturnService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param salesReturn 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody SalesReturnPO salesReturn) {
        return ResultUtils.success(this.salesReturnService.save(salesReturn));
    }

    /**
     * 修改数据
     *
     * @param salesReturn 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody SalesReturnPO salesReturn) {
        return ResultUtils.success(this.salesReturnService.updateById(salesReturn));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.salesReturnService.removeByIds(idList));
    }
}

