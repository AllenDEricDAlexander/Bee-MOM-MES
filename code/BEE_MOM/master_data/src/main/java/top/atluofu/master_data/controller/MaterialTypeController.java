package top.atluofu.master_data.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.master_data.po.MaterialTypePO;
import top.atluofu.master_data.service.MaterialTypeService;

import java.io.Serializable;
import java.util.List;

/**
 * (MaterialType)表控制层
 *
 * @author atluofu
 * @since 2023-10-27 09:05:05
 */
@Tag(name = "MaterialTypeController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("materialType")
public class MaterialTypeController {
    /**
     * 服务对象
     */
    private MaterialTypeService materialTypeService;
    
    MaterialTypeController(MaterialTypeService materialTypeService){this.materialTypeService = materialTypeService;}

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param materialType 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<MaterialTypePO> page, MaterialTypePO materialType) {
        return ResultUtils.success(this.materialTypeService.page(page, new QueryWrapper<>(materialType)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.materialTypeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param materialType 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody MaterialTypePO materialType) {
        return ResultUtils.success(this.materialTypeService.save(materialType));
    }

    /**
     * 修改数据
     *
     * @param materialType 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody MaterialTypePO materialType) {
        return ResultUtils.success(this.materialTypeService.updateById(materialType));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.materialTypeService.removeByIds(idList));
    }
}

