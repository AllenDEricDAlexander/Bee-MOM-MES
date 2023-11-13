package top.atluofu.master_data.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.master_data.bo.DepartmentBO;
import top.atluofu.master_data.po.DepartmentPO;
import top.atluofu.master_data.service.DepartmentService;

import java.io.Serializable;
import java.util.List;

/**
 * (Department)表控制层
 *
 * @author atluofu
 * @since 2023-10-27 09:04:50
 */
@Tag(name = "DepartmentController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("department")
public class DepartmentController {
    /**
     * 服务对象
     */
    private DepartmentService departmentService;

    DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll() {
        return ResultUtils.success(DepartmentBO.poToBO(this.departmentService.list()));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.departmentService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param department 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody DepartmentPO department) {
        return ResultUtils.success(this.departmentService.save(department));
    }

    /**
     * 修改数据
     *
     * @param department 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody DepartmentPO department) {
        return ResultUtils.success(this.departmentService.updateById(department));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.departmentService.removeByIds(idList));
    }
}

