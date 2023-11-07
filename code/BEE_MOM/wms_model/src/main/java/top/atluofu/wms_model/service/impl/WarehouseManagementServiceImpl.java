package top.atluofu.wms_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.wms_model.dao.WarehouseManagementDao;
import top.atluofu.wms_model.po.WarehouseManagementPO;
import top.atluofu.wms_model.service.WarehouseManagementService;

/**
 * (WarehouseManagement)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:05
 */
@Service("warehouseManagementService")
public class WarehouseManagementServiceImpl extends BaseServiceImpl<WarehouseManagementDao, WarehouseManagementPO> implements WarehouseManagementService {

}

