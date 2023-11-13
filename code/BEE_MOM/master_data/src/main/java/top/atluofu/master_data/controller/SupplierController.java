package top.atluofu.master_data.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.atluofu.common.result.LuoFuPage;
import top.atluofu.common.result.ResultUtils;
import top.atluofu.master_data.dto.SupplierListDTO;
import top.atluofu.master_data.po.SupplierPO;
import top.atluofu.master_data.service.SupplierService;

import java.io.Serializable;
import java.util.List;

/**
 * (Supplier)表控制层
 *
 * @author atluofu
 * @since 2023-10-27 09:05:31
 */
@Tag(name = "SupplierController模块")
@RestController
@Slf4j
@Validated
@RequestMapping("supplier")
public class SupplierController {
    /**
     * 服务对象
     */
    private final SupplierService supplierService;

    SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param supplier 查询实体
     * @return 所有数据
     */
    @PostMapping("list/{pageNo}/{pageSize}")
    public ResultUtils selectAll(@PathVariable int pageNo, @PathVariable int pageSize, @RequestBody(required = false) SupplierListDTO supplier) {
        List<SupplierListDTO> all = supplierService.getAll(supplier);
        LuoFuPage<SupplierListDTO> supplierListDTOLuoFuPage = new LuoFuPage<>(pageNo, pageSize, all.size(), all);
        return ResultUtils.success(supplierListDTOLuoFuPage);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultUtils selectOne(@PathVariable Serializable id) {
        return ResultUtils.success(SupplierListDTO.toDTO(this.supplierService.getById(id)));
    }

    /**
     * 新增数据
     *
     * @param supplier 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultUtils insert(@RequestBody SupplierPO supplier) {
        return ResultUtils.success(this.supplierService.save(supplier));
    }

    /**
     * 修改数据
     *
     * @param supplier 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultUtils update(@RequestBody SupplierPO supplier) {
        return ResultUtils.success(this.supplierService.updateById(supplier));
    }

    /**
     * 根据id删除数据
     *
     * @param id 要删除的数据的id
     * @return 删除结果
     */
    @DeleteMapping("{id}")
    @Operation(description = "根据id删除")
    public ResultUtils deleteOne(@PathVariable Long id) {
        return ResultUtils.success(this.supplierService.removeById(id));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultUtils delete(@RequestBody List<Long> idList) {
        return ResultUtils.success(this.supplierService.removeByIds(idList));
    }
}

