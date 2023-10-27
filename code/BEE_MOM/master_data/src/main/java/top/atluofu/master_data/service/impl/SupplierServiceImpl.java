package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.SupplierDao;
import top.atluofu.master_data.entity.Supplier;
import top.atluofu.master_data.service.SupplierService;
import org.springframework.stereotype.Service;

/**
 * (Supplier)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-26 22:46:52
 */
@Service("supplierService")
public class SupplierServiceImpl extends BaseServiceImpl<SupplierDao, Supplier> implements SupplierService {

}

