package top.atluofu.master_data.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.master_data.po.ProductTypePO;
import top.atluofu.master_data.service.ProductTypeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (ProductType)表控制层
 *
 * @author atluofu
 * @since 2023-10-27 09:05:12
 */
@Api(tags = "ProductTypeController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("productType")
public class ProductTypeController {
    /**
     * 服务对象
     */
    private ProductTypeService productTypeService;
    
    ProductTypeController(ProductTypeService productTypeService){this.productTypeService = productTypeService;}

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param productType 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ProductTypePO> page, ProductTypePO productType) {
        return ResultUtils.success(this.productTypeService.page(page, new QueryWrapper<>(productType)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.productTypeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param productType 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ProductTypePO productType) {
        return ResultUtils.success(this.productTypeService.save(productType));
    }

    /**
     * 修改数据
     *
     * @param productType 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ProductTypePO productType) {
        return ResultUtils.success(this.productTypeService.updateById(productType));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.productTypeService.removeByIds(idList));
    }
}

