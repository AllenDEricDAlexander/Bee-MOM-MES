package top.atluofu.qa_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.qa_model.po.ProcessInspectionRecordFormPO;
import top.atluofu.qa_model.service.ProcessInspectionRecordFormService;

import java.io.Serializable;
import java.util.List;

/**
 * (ProcessInspectionRecordForm)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:47:18
 */
@Tag(name = "ProcessInspectionRecordFormController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("processInspectionRecordForm")
public class ProcessInspectionRecordFormController {
    /**
     * 服务对象
     */
    private final ProcessInspectionRecordFormService processInspectionRecordFormService;

    ProcessInspectionRecordFormController(ProcessInspectionRecordFormService processInspectionRecordFormService) {
        this.processInspectionRecordFormService = processInspectionRecordFormService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                        分页对象
     * @param processInspectionRecordForm 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ProcessInspectionRecordFormPO> page, ProcessInspectionRecordFormPO processInspectionRecordForm) {
        return ResultUtils.success(this.processInspectionRecordFormService.page(page, new QueryWrapper<>(processInspectionRecordForm)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.processInspectionRecordFormService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param processInspectionRecordForm 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ProcessInspectionRecordFormPO processInspectionRecordForm) {
        return ResultUtils.success(this.processInspectionRecordFormService.save(processInspectionRecordForm));
    }

    /**
     * 修改数据
     *
     * @param processInspectionRecordForm 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ProcessInspectionRecordFormPO processInspectionRecordForm) {
        return ResultUtils.success(this.processInspectionRecordFormService.updateById(processInspectionRecordForm));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.processInspectionRecordFormService.removeByIds(idList));
    }
}

