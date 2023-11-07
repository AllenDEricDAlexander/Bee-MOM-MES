package top.atluofu.qa_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.qa_model.po.EntranceInspectionRecordFormPO;
import top.atluofu.qa_model.service.EntranceInspectionRecordFormService;

import java.io.Serializable;
import java.util.List;

/**
 * (EntranceInspectionRecordForm)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:47:17
 */
@Tag(name = "EntranceInspectionRecordFormController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("entranceInspectionRecordForm")
public class EntranceInspectionRecordFormController {
    /**
     * 服务对象
     */
    private final EntranceInspectionRecordFormService entranceInspectionRecordFormService;

    EntranceInspectionRecordFormController(EntranceInspectionRecordFormService entranceInspectionRecordFormService) {
        this.entranceInspectionRecordFormService = entranceInspectionRecordFormService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                         分页对象
     * @param entranceInspectionRecordForm 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<EntranceInspectionRecordFormPO> page, EntranceInspectionRecordFormPO entranceInspectionRecordForm) {
        return ResultUtils.success(this.entranceInspectionRecordFormService.page(page, new QueryWrapper<>(entranceInspectionRecordForm)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.entranceInspectionRecordFormService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param entranceInspectionRecordForm 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody EntranceInspectionRecordFormPO entranceInspectionRecordForm) {
        return ResultUtils.success(this.entranceInspectionRecordFormService.save(entranceInspectionRecordForm));
    }

    /**
     * 修改数据
     *
     * @param entranceInspectionRecordForm 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody EntranceInspectionRecordFormPO entranceInspectionRecordForm) {
        return ResultUtils.success(this.entranceInspectionRecordFormService.updateById(entranceInspectionRecordForm));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.entranceInspectionRecordFormService.removeByIds(idList));
    }
}

