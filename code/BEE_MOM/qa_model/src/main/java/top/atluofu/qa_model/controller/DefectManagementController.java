package top.atluofu.qa_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.qa_model.po.DefectManagementPO;
import top.atluofu.qa_model.service.DefectManagementService;

import java.io.Serializable;
import java.util.List;

/**
 * (DefectManagement)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:47:16
 */
@Tag(name = "DefectManagementController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("defectManagement")
public class DefectManagementController {
    /**
     * 服务对象
     */
    private final DefectManagementService defectManagementService;

    DefectManagementController(DefectManagementService defectManagementService) {
        this.defectManagementService = defectManagementService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page             分页对象
     * @param defectManagement 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<DefectManagementPO> page, DefectManagementPO defectManagement) {
        return ResultUtils.success(this.defectManagementService.page(page, new QueryWrapper<>(defectManagement)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.defectManagementService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param defectManagement 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody DefectManagementPO defectManagement) {
        return ResultUtils.success(this.defectManagementService.save(defectManagement));
    }

    /**
     * 修改数据
     *
     * @param defectManagement 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody DefectManagementPO defectManagement) {
        return ResultUtils.success(this.defectManagementService.updateById(defectManagement));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.defectManagementService.removeByIds(idList));
    }
}

