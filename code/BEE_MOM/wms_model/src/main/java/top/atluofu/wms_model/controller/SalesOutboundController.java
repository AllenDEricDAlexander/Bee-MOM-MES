package top.atluofu.wms_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.wms_model.po.SalesOutboundPO;
import top.atluofu.wms_model.service.SalesOutboundService;

import java.io.Serializable;
import java.util.List;

/**
 * (SalesOutbound)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:56:04
 */
@Tag(name = "SalesOutboundController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("salesOutbound")
public class SalesOutboundController {
    /**
     * 服务对象
     */
    private final SalesOutboundService salesOutboundService;

    SalesOutboundController(SalesOutboundService salesOutboundService) {
        this.salesOutboundService = salesOutboundService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page          分页对象
     * @param salesOutbound 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<SalesOutboundPO> page, SalesOutboundPO salesOutbound) {
        return ResultUtils.success(this.salesOutboundService.page(page, new QueryWrapper<>(salesOutbound)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.salesOutboundService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param salesOutbound 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody SalesOutboundPO salesOutbound) {
        return ResultUtils.success(this.salesOutboundService.save(salesOutbound));
    }

    /**
     * 修改数据
     *
     * @param salesOutbound 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody SalesOutboundPO salesOutbound) {
        return ResultUtils.success(this.salesOutboundService.updateById(salesOutbound));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.salesOutboundService.removeByIds(idList));
    }
}

