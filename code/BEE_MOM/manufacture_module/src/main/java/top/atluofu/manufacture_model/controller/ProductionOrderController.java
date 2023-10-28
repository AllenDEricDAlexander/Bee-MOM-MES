package top.atluofu.manufacture_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_model.po.ProductionOrderPO;
import top.atluofu.manufacture_model.service.ProductionOrderService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (ProductionOrder)表控制层
 *
 * @author atluofu
 * @since 2023-10-28 13:36:19
 */
@Api(tags = "ProductionOrderController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("productionOrder")
public class ProductionOrderController {
    /**
     * 服务对象
     */
    private final ProductionOrderService productionOrderService;

    ProductionOrderController(ProductionOrderService productionOrderService) {
        this.productionOrderService = productionOrderService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page            分页对象
     * @param productionOrder 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ProductionOrderPO> page, ProductionOrderPO productionOrder) {
        return ResultUtils.success(this.productionOrderService.page(page, new QueryWrapper<>(productionOrder)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.productionOrderService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param productionOrder 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ProductionOrderPO productionOrder) {
        return ResultUtils.success(this.productionOrderService.save(productionOrder));
    }

    /**
     * 修改数据
     *
     * @param productionOrder 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ProductionOrderPO productionOrder) {
        return ResultUtils.success(this.productionOrderService.updateById(productionOrder));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.productionOrderService.removeByIds(idList));
    }
}

