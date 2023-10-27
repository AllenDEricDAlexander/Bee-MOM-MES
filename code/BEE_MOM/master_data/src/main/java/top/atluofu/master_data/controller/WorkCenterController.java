package top.atluofu.master_data.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.master_data.entity.WorkCenter;
import top.atluofu.master_data.service.WorkCenterService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (WorkCenter)表控制层
 *
 * @author atluofu
 * @since 2023-10-26 22:47:00
 */
@Api(tags = "模块")
@RestController
@Slf4j
@Validated
@RequestMapping("workCenter")
public class WorkCenterController {
    /**
     * 服务对象
     */
    private WorkCenterService workCenterService;

    public WorkCenterController(WorkCenterService workCenterService) {
        this.workCenterService = workCenterService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param workCenter 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<WorkCenter> page, WorkCenter workCenter) {
        return ResultUtils.success(this.workCenterService.page(page, new QueryWrapper<>(workCenter)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.workCenterService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param workCenter 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody WorkCenter workCenter) {
        return ResultUtils.success(this.workCenterService.save(workCenter));
    }

    /**
     * 修改数据
     *
     * @param workCenter 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody WorkCenter workCenter) {
        return ResultUtils.success(this.workCenterService.updateById(workCenter));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.workCenterService.removeByIds(idList));
    }
}

