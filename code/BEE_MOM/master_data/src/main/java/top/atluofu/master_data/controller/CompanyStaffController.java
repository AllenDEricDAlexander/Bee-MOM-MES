package top.atluofu.master_data.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.master_data.po.CompanyStaffPO;
import top.atluofu.master_data.service.CompanyStaffService;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.Api;

import java.io.Serializable;
import java.util.List;

/**
 * (CompanyStaff)表控制层
 *
 * @author atluofu
 * @since 2023-10-27 09:04:40
 */
@Api(tags = "CompanyStaffController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("companyStaff")
public class CompanyStaffController {
    /**
     * 服务对象
     */
    private CompanyStaffService companyStaffService;
    
    CompanyStaffController(CompanyStaffService companyStaffService){this.companyStaffService = companyStaffService;}

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param companyStaff 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultUtils selectAll(Page<CompanyStaffPO> page, CompanyStaffPO companyStaff) {
        return ResultUtils.success(this.companyStaffService.page(page, new QueryWrapper<>(companyStaff)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(this.companyStaffService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param companyStaff 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody CompanyStaffPO companyStaff) {
        return ResultUtils.success(this.companyStaffService.save(companyStaff));
    }

    /**
     * 修改数据
     *
     * @param companyStaff 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody CompanyStaffPO companyStaff) {
        return ResultUtils.success(this.companyStaffService.updateById(companyStaff));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestParam("idList") List<Long> idList) {
        return ResultUtils.success(this.companyStaffService.removeByIds(idList));
    }
}

