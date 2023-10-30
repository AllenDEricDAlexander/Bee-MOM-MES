package top.atluofu.manufacture_technology_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.manufacture_technology_model.po.TechnicalOrderNotificationPO;
import top.atluofu.manufacture_technology_model.service.TechnicalOrderNotificationService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (TechnicalOrderNotification)表控制层
 *
 * @author atluofu
 * @since 2023-10-30 22:55:14
 */
@Api(tags = "TechnicalOrderNotificationController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("technicalOrderNotification")
public class TechnicalOrderNotificationController {
    /**
     * 服务对象
     */
    private final TechnicalOrderNotificationService technicalOrderNotificationService;

    TechnicalOrderNotificationController(TechnicalOrderNotificationService technicalOrderNotificationService) {
        this.technicalOrderNotificationService = technicalOrderNotificationService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                       分页对象
     * @param technicalOrderNotification 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<TechnicalOrderNotificationPO> page, TechnicalOrderNotificationPO technicalOrderNotification) {
        return ResultUtils.success(this.technicalOrderNotificationService.page(page, new QueryWrapper<>(technicalOrderNotification)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.technicalOrderNotificationService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param technicalOrderNotification 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody TechnicalOrderNotificationPO technicalOrderNotification) {
        return ResultUtils.success(this.technicalOrderNotificationService.save(technicalOrderNotification));
    }

    /**
     * 修改数据
     *
     * @param technicalOrderNotification 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody TechnicalOrderNotificationPO technicalOrderNotification) {
        return ResultUtils.success(this.technicalOrderNotificationService.updateById(technicalOrderNotification));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.technicalOrderNotificationService.removeByIds(idList));
    }
}

