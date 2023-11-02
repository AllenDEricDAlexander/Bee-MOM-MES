package top.atluofu.manufacture_technology_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_technology_model.po.TechnicalDisciplineProblemsPO;
import top.atluofu.manufacture_technology_model.service.TechnicalDisciplineProblemsService;

import java.io.Serializable;
import java.util.List;

/**
 * (TechnicalDisciplineProblems)表控制层
 *
 * @author atluofu
 * @since 2023-10-30 22:55:14
 */
@Tag(name = "TechnicalDisciplineProblemsController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("technicalDisciplineProblems")
public class TechnicalDisciplineProblemsController {
    /**
     * 服务对象
     */
    private final TechnicalDisciplineProblemsService technicalDisciplineProblemsService;

    TechnicalDisciplineProblemsController(TechnicalDisciplineProblemsService technicalDisciplineProblemsService) {
        this.technicalDisciplineProblemsService = technicalDisciplineProblemsService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                        分页对象
     * @param technicalDisciplineProblems 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<TechnicalDisciplineProblemsPO> page, TechnicalDisciplineProblemsPO technicalDisciplineProblems) {
        return ResultUtils.success(this.technicalDisciplineProblemsService.page(page, new QueryWrapper<>(technicalDisciplineProblems)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.technicalDisciplineProblemsService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param technicalDisciplineProblems 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody TechnicalDisciplineProblemsPO technicalDisciplineProblems) {
        return ResultUtils.success(this.technicalDisciplineProblemsService.save(technicalDisciplineProblems));
    }

    /**
     * 修改数据
     *
     * @param technicalDisciplineProblems 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody TechnicalDisciplineProblemsPO technicalDisciplineProblems) {
        return ResultUtils.success(this.technicalDisciplineProblemsService.updateById(technicalDisciplineProblems));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.technicalDisciplineProblemsService.removeByIds(idList));
    }
}

