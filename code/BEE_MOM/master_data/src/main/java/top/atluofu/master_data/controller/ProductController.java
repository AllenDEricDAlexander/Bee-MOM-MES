package top.atluofu.master_data.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.master_data.po.ProductPO;
import top.atluofu.master_data.service.ProductService;

import java.io.Serializable;
import java.util.List;

/**
 * (Product)表控制层
 *
 * @author atluofu
 * @since 2023-10-27 09:05:08
 */
@Tag(name = "ProductController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("product")
public class ProductController {
    /**
     * 服务对象
     */
    private ProductService productService;
    
    ProductController(ProductService productService){this.productService = productService;}

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param product 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ProductPO> page, ProductPO product) {
        return ResultUtils.success(this.productService.page(page, new QueryWrapper<>(product)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.productService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param product 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ProductPO product) {
        return ResultUtils.success(this.productService.save(product));
    }

    /**
     * 修改数据
     *
     * @param product 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ProductPO product) {
        return ResultUtils.success(this.productService.updateById(product));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.productService.removeByIds(idList));
    }
}

