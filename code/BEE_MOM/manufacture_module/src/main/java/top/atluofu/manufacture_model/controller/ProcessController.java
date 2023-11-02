package top.atluofu.manufacture_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_model.po.ProcessPO;
import top.atluofu.manufacture_model.service.ProcessService;

import java.io.Serializable;
import java.util.List;

/**
 * (Process)表控制层
 *
 * @author atluofu
 * @since 2023-10-28 13:36:18
 */
@Tag(name = "ProcessController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("process")
public class ProcessController {
    /**
     * 服务对象
     */
    private final ProcessService processService;

    ProcessController(ProcessService processService) {
        this.processService = processService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page    分页对象
     * @param process 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ProcessPO> page, ProcessPO process) {
        return ResultUtils.success(this.processService.page(page, new QueryWrapper<>(process)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.processService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param process 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ProcessPO process) {
        return ResultUtils.success(this.processService.save(process));
    }

    /**
     * 修改数据
     *
     * @param process 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ProcessPO process) {
        return ResultUtils.success(this.processService.updateById(process));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.processService.removeByIds(idList));
    }
}

