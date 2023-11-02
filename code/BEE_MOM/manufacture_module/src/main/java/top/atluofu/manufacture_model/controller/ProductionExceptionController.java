package top.atluofu.manufacture_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_model.po.ProductionExceptionPO;
import top.atluofu.manufacture_model.service.ProductionExceptionService;

import java.io.Serializable;
import java.util.List;

/**
 * (ProductionException)表控制层
 *
 * @author atluofu
 * @since 2023-10-28 13:36:18
 */
@Tag(name = "ProductionExceptionController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("productionException")
public class ProductionExceptionController {
    /**
     * 服务对象
     */
    private final ProductionExceptionService productionExceptionService;

    ProductionExceptionController(ProductionExceptionService productionExceptionService) {
        this.productionExceptionService = productionExceptionService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                分页对象
     * @param productionException 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ProductionExceptionPO> page, ProductionExceptionPO productionException) {
        return ResultUtils.success(this.productionExceptionService.page(page, new QueryWrapper<>(productionException)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.productionExceptionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param productionException 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ProductionExceptionPO productionException) {
        return ResultUtils.success(this.productionExceptionService.save(productionException));
    }

    /**
     * 修改数据
     *
     * @param productionException 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ProductionExceptionPO productionException) {
        return ResultUtils.success(this.productionExceptionService.updateById(productionException));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.productionExceptionService.removeByIds(idList));
    }
}

