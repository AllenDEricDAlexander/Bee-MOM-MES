package top.atluofu.manufacture_technology_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_technology_model.po.WorkDrawFilePO;
import top.atluofu.manufacture_technology_model.service.WorkDrawFileService;

import java.io.Serializable;
import java.util.List;

/**
 * (WorkDrawFile)表控制层
 *
 * @author atluofu
 * @since 2023-10-30 22:55:15
 */
@Tag(name = "WorkDrawFileController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("workDrawFile")
public class WorkDrawFileController {
    /**
     * 服务对象
     */
    private final WorkDrawFileService workDrawFileService;

    WorkDrawFileController(WorkDrawFileService workDrawFileService) {
        this.workDrawFileService = workDrawFileService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page         分页对象
     * @param workDrawFile 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<WorkDrawFilePO> page, WorkDrawFilePO workDrawFile) {
        return ResultUtils.success(this.workDrawFileService.page(page, new QueryWrapper<>(workDrawFile)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.workDrawFileService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param workDrawFile 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody WorkDrawFilePO workDrawFile) {
        return ResultUtils.success(this.workDrawFileService.save(workDrawFile));
    }

    /**
     * 修改数据
     *
     * @param workDrawFile 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody WorkDrawFilePO workDrawFile) {
        return ResultUtils.success(this.workDrawFileService.updateById(workDrawFile));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.workDrawFileService.removeByIds(idList));
    }
}

