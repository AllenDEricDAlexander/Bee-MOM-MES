package top.atluofu.manufacture_technology_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_technology_model.po.TechnicalProblemsPO;
import top.atluofu.manufacture_technology_model.service.TechnicalProblemsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (TechnicalProblems)表控制层
 *
 * @author atluofu
 * @since 2023-10-30 22:55:14
 */
@Api(tags = "TechnicalProblemsController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("technicalProblems")
public class TechnicalProblemsController {
    /**
     * 服务对象
     */
    private final TechnicalProblemsService technicalProblemsService;

    TechnicalProblemsController(TechnicalProblemsService technicalProblemsService) {
        this.technicalProblemsService = technicalProblemsService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page              分页对象
     * @param technicalProblems 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<TechnicalProblemsPO> page, TechnicalProblemsPO technicalProblems) {
        return ResultUtils.success(this.technicalProblemsService.page(page, new QueryWrapper<>(technicalProblems)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.technicalProblemsService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param technicalProblems 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody TechnicalProblemsPO technicalProblems) {
        return ResultUtils.success(this.technicalProblemsService.save(technicalProblems));
    }

    /**
     * 修改数据
     *
     * @param technicalProblems 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody TechnicalProblemsPO technicalProblems) {
        return ResultUtils.success(this.technicalProblemsService.updateById(technicalProblems));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.technicalProblemsService.removeByIds(idList));
    }
}

