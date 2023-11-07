package top.atluofu.qa_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.qa_model.po.QualityPlanInfoPO;
import top.atluofu.qa_model.service.QualityPlanInfoService;

import java.io.Serializable;
import java.util.List;

/**
 * (QualityPlanInfo)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:47:19
 */
@Tag(name = "QualityPlanInfoController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("qualityPlanInfo")
public class QualityPlanInfoController {
    /**
     * 服务对象
     */
    private final QualityPlanInfoService qualityPlanInfoService;

    QualityPlanInfoController(QualityPlanInfoService qualityPlanInfoService) {
        this.qualityPlanInfoService = qualityPlanInfoService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page            分页对象
     * @param qualityPlanInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<QualityPlanInfoPO> page, QualityPlanInfoPO qualityPlanInfo) {
        return ResultUtils.success(this.qualityPlanInfoService.page(page, new QueryWrapper<>(qualityPlanInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.qualityPlanInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param qualityPlanInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody QualityPlanInfoPO qualityPlanInfo) {
        return ResultUtils.success(this.qualityPlanInfoService.save(qualityPlanInfo));
    }

    /**
     * 修改数据
     *
     * @param qualityPlanInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody QualityPlanInfoPO qualityPlanInfo) {
        return ResultUtils.success(this.qualityPlanInfoService.updateById(qualityPlanInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.qualityPlanInfoService.removeByIds(idList));
    }
}

