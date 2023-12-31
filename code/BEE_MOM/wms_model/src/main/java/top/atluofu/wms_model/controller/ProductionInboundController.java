package top.atluofu.wms_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.wms_model.po.ProductionInboundPO;
import top.atluofu.wms_model.service.ProductionInboundService;

import java.io.Serializable;
import java.util.List;

/**
 * (ProductionInbound)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:56:02
 */
@Tag(name = "ProductionInboundController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("productionInbound")
public class ProductionInboundController {
    /**
     * 服务对象
     */
    private final ProductionInboundService productionInboundService;

    ProductionInboundController(ProductionInboundService productionInboundService) {
        this.productionInboundService = productionInboundService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page              分页对象
     * @param productionInbound 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ProductionInboundPO> page, ProductionInboundPO productionInbound) {
        return ResultUtils.success(this.productionInboundService.page(page, new QueryWrapper<>(productionInbound)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.productionInboundService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param productionInbound 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ProductionInboundPO productionInbound) {
        return ResultUtils.success(this.productionInboundService.save(productionInbound));
    }

    /**
     * 修改数据
     *
     * @param productionInbound 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ProductionInboundPO productionInbound) {
        return ResultUtils.success(this.productionInboundService.updateById(productionInbound));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.productionInboundService.removeByIds(idList));
    }
}

