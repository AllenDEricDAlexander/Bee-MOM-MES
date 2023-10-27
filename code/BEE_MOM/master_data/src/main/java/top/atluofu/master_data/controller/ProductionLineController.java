package top.atluofu.master_data.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.master_data.po.ProductionLinePO;
import top.atluofu.master_data.service.ProductionLineService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (ProductionLine)表控制层
 *
 * @author atluofu
 * @since 2023-10-27 09:05:19
 */
@Api(tags = "ProductionLineController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("productionLine")
public class ProductionLineController {
    /**
     * 服务对象
     */
    private ProductionLineService productionLineService;
    
    ProductionLineController(ProductionLineService productionLineService){this.productionLineService = productionLineService;}

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param productionLine 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ProductionLinePO> page, ProductionLinePO productionLine) {
        return ResultUtils.success(this.productionLineService.page(page, new QueryWrapper<>(productionLine)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.productionLineService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param productionLine 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ProductionLinePO productionLine) {
        return ResultUtils.success(this.productionLineService.save(productionLine));
    }

    /**
     * 修改数据
     *
     * @param productionLine 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ProductionLinePO productionLine) {
        return ResultUtils.success(this.productionLineService.updateById(productionLine));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.productionLineService.removeByIds(idList));
    }
}

