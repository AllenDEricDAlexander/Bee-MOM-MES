package top.atluofu.qa_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.qa_model.po.DefectManagementTypePO;
import top.atluofu.qa_model.service.DefectManagementTypeService;

import java.io.Serializable;
import java.util.List;

/**
 * (DefectManagementType)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:47:17
 */
@Tag(name = "DefectManagementTypeController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("defectManagementType")
public class DefectManagementTypeController {
    /**
     * 服务对象
     */
    private final DefectManagementTypeService defectManagementTypeService;

    DefectManagementTypeController(DefectManagementTypeService defectManagementTypeService) {
        this.defectManagementTypeService = defectManagementTypeService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                 分页对象
     * @param defectManagementType 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<DefectManagementTypePO> page, DefectManagementTypePO defectManagementType) {
        return ResultUtils.success(this.defectManagementTypeService.page(page, new QueryWrapper<>(defectManagementType)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.defectManagementTypeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param defectManagementType 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody DefectManagementTypePO defectManagementType) {
        return ResultUtils.success(this.defectManagementTypeService.save(defectManagementType));
    }

    /**
     * 修改数据
     *
     * @param defectManagementType 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody DefectManagementTypePO defectManagementType) {
        return ResultUtils.success(this.defectManagementTypeService.updateById(defectManagementType));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.defectManagementTypeService.removeByIds(idList));
    }
}

