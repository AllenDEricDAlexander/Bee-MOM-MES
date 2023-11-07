package top.atluofu.qa_model.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.qa_model.po.CertificateManagementPO;
import top.atluofu.qa_model.service.CertificateManagementService;

import java.io.Serializable;
import java.util.List;

/**
 * (CertificateManagement)表控制层
 *
 * @author atluofu
 * @since 2023-11-07 08:47:15
 */
@Tag(name = "CertificateManagementController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("certificateManagement")
public class CertificateManagementController {
    /**
     * 服务对象
     */
    private final CertificateManagementService certificateManagementService;

    CertificateManagementController(CertificateManagementService certificateManagementService) {
        this.certificateManagementService = certificateManagementService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page                  分页对象
     * @param certificateManagement 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<CertificateManagementPO> page, CertificateManagementPO certificateManagement) {
        return ResultUtils.success(this.certificateManagementService.page(page, new QueryWrapper<>(certificateManagement)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.certificateManagementService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param certificateManagement 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody CertificateManagementPO certificateManagement) {
        return ResultUtils.success(this.certificateManagementService.save(certificateManagement));
    }

    /**
     * 修改数据
     *
     * @param certificateManagement 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody CertificateManagementPO certificateManagement) {
        return ResultUtils.success(this.certificateManagementService.updateById(certificateManagement));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.certificateManagementService.removeByIds(idList));
    }
}

