package top.atluofu.master_data.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import top.atluofu.master_data.po.SupplierPO;
import top.atluofu.master_data.query.SupplierQuery;

/**
 * (Supplier)表服务接口
 *
 * @author atluofu
 * @since 2023-10-27 09:05:31
 */
public interface SupplierService extends IService<SupplierPO> {

    Page<SupplierPO>  getPage(SupplierQuery supplier);
}

