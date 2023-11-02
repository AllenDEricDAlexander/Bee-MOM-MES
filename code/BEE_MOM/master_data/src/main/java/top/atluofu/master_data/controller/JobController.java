package top.atluofu.master_data.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.master_data.po.JobPO;
import top.atluofu.master_data.service.JobService;

import java.io.Serializable;
import java.util.List;

/**
 * (Job)表控制层
 *
 * @author atluofu
 * @since 2023-10-27 09:04:57
 */
@Tag(name = "JobController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("job")
public class JobController {
    /**
     * 服务对象
     */
    private JobService jobService;
    
    JobController(JobService jobService){this.jobService = jobService;}

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param job 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<JobPO> page, JobPO job) {
        return ResultUtils.success(this.jobService.page(page, new QueryWrapper<>(job)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.jobService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param job 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody JobPO job) {
        return ResultUtils.success(this.jobService.save(job));
    }

    /**
     * 修改数据
     *
     * @param job 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody JobPO job) {
        return ResultUtils.success(this.jobService.updateById(job));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.jobService.removeByIds(idList));
    }
}

