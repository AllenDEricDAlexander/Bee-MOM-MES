package top.atluofu.master_data.service.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.SupplierDao;
import top.atluofu.master_data.dto.SupplierListDTO;
import top.atluofu.master_data.po.SupplierPO;
import top.atluofu.master_data.query.SupplierQuery;
import top.atluofu.master_data.service.SupplierService;

import java.util.List;

/**
 * (Supplier)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:05:31
 */
@Service("supplierService")
public class SupplierServiceImpl extends BaseServiceImpl<SupplierDao, SupplierPO> implements SupplierService {

    @Autowired
    SupplierDao supplierDao;

    @Override
    public Page<SupplierPO> getPage(SupplierQuery supplier) {
        LambdaQueryChainWrapper<SupplierPO> gt = lambdaQuery().eq(SupplierPO::getSupplierName, supplier.getSupplierName())
                .eq(SupplierPO::getEnableStatus, supplier.getStatus())
                .eq(SupplierPO::getShortName, supplier.getSupplierShortName())
                .eq(SupplierPO::getSupplierGrade, supplier.getGrade())
                .eq(SupplierPO::getSupplierNo, supplier.getSupplierNo())
                .ge(SupplierPO::getSupplierScore, supplier.getMinScore())
                .gt(SupplierPO::getSupplierScore, supplier.getMaxScore());
        return baseMapper.selectPage(new Page<>(supplier.getPageNo(), supplier.getPageSize()), gt);
    }

    @Override
    public List<SupplierListDTO> getAll(SupplierListDTO supplier) {
        List<SupplierPO> supplierPOS = supplierDao.getAll(SupplierListDTO.toPO(supplier));
        return SupplierListDTO.toDTOs(supplierPOS);
    }
}

