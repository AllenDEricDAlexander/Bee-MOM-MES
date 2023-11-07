package top.atluofu.wms_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.wms_model.po.ReturnBoxInfoPO;
import top.atluofu.wms_model.service.ReturnBoxInfoService;

import java.io.Serializable;
import java.util.List;

/**
 * (ReturnBoxInfo)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:56:04
 */
@Tag(name = "ReturnBoxInfoController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("returnBoxInfo")
public class ReturnBoxInfoController {
    /**
     * 服务对象
     */
    private final ReturnBoxInfoService returnBoxInfoService;

    ReturnBoxInfoController(ReturnBoxInfoService returnBoxInfoService) {
        this.returnBoxInfoService = returnBoxInfoService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page          分页对象
     * @param returnBoxInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<ReturnBoxInfoPO> page, ReturnBoxInfoPO returnBoxInfo) {
        return ResultUtils.success(this.returnBoxInfoService.page(page, new QueryWrapper<>(returnBoxInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.returnBoxInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param returnBoxInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody ReturnBoxInfoPO returnBoxInfo) {
        return ResultUtils.success(this.returnBoxInfoService.save(returnBoxInfo));
    }

    /**
     * 修改数据
     *
     * @param returnBoxInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody ReturnBoxInfoPO returnBoxInfo) {
        return ResultUtils.success(this.returnBoxInfoService.updateById(returnBoxInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.returnBoxInfoService.removeByIds(idList));
    }
}

