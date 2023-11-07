package top.atluofu.wms_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.wms_model.po.PurchaseInboundPO;
import top.atluofu.wms_model.service.PurchaseInboundService;

import java.io.Serializable;
import java.util.List;

/**
 * (PurchaseInbound)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:56:03
 */
@Tag(name = "PurchaseInboundController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("purchaseInbound")
public class PurchaseInboundController {
    /**
     * 服务对象
     */
    private final PurchaseInboundService purchaseInboundService;

    PurchaseInboundController(PurchaseInboundService purchaseInboundService) {
        this.purchaseInboundService = purchaseInboundService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page            分页对象
     * @param purchaseInbound 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<PurchaseInboundPO> page, PurchaseInboundPO purchaseInbound) {
        return ResultUtils.success(this.purchaseInboundService.page(page, new QueryWrapper<>(purchaseInbound)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.purchaseInboundService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param purchaseInbound 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody PurchaseInboundPO purchaseInbound) {
        return ResultUtils.success(this.purchaseInboundService.save(purchaseInbound));
    }

    /**
     * 修改数据
     *
     * @param purchaseInbound 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody PurchaseInboundPO purchaseInbound) {
        return ResultUtils.success(this.purchaseInboundService.updateById(purchaseInbound));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.purchaseInboundService.removeByIds(idList));
    }
}

