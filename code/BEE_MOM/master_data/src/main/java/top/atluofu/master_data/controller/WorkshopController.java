package top.atluofu.master_data.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.master_data.po.WorkshopPO;
import top.atluofu.master_data.service.WorkshopService;

import java.io.Serializable;
import java.util.List;

/**
 * (Workshop)表控制层
 *
 * @author atluofu
 * @since 2023-10-27 09:05:43
 */
@Tag(name = "WorkshopController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("workshop")
public class WorkshopController {
    /**
     * 服务对象
     */
    private WorkshopService workshopService;
    
    WorkshopController(WorkshopService workshopService){this.workshopService = workshopService;}

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param workshop 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<WorkshopPO> page, WorkshopPO workshop) {
        return ResultUtils.success(this.workshopService.page(page, new QueryWrapper<>(workshop)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.workshopService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param workshop 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody WorkshopPO workshop) {
        return ResultUtils.success(this.workshopService.save(workshop));
    }

    /**
     * 修改数据
     *
     * @param workshop 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody WorkshopPO workshop) {
        return ResultUtils.success(this.workshopService.updateById(workshop));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.workshopService.removeByIds(idList));
    }
}

