package top.atluofu.manufacture_technology_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_technology_model.po.NcProgramFilePO;
import top.atluofu.manufacture_technology_model.service.NcProgramFileService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (NcProgramFile)表控制层
 *
 * @author atluofu
 * @since 2023-10-30 22:55:13
 */
@Api(tags = "NcProgramFileController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("ncProgramFile")
public class NcProgramFileController {
    /**
     * 服务对象
     */
    private final NcProgramFileService ncProgramFileService;

    NcProgramFileController(NcProgramFileService ncProgramFileService) {
        this.ncProgramFileService = ncProgramFileService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page          分页对象
     * @param ncProgramFile 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<NcProgramFilePO> page, NcProgramFilePO ncProgramFile) {
        return ResultUtils.success(this.ncProgramFileService.page(page, new QueryWrapper<>(ncProgramFile)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.ncProgramFileService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param ncProgramFile 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody NcProgramFilePO ncProgramFile) {
        return ResultUtils.success(this.ncProgramFileService.save(ncProgramFile));
    }

    /**
     * 修改数据
     *
     * @param ncProgramFile 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody NcProgramFilePO ncProgramFile) {
        return ResultUtils.success(this.ncProgramFileService.updateById(ncProgramFile));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.ncProgramFileService.removeByIds(idList));
    }
}

