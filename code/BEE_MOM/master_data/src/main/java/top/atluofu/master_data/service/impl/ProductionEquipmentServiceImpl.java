package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.ProductionEquipmentDao;
import top.atluofu.master_data.po.ProductionEquipmentPO;
import top.atluofu.master_data.service.ProductionEquipmentService;
import org.springframework.stereotype.Service;

/**
 * (ProductionEquipment)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:05:16
 */
@Service("productionEquipmentService")
public class ProductionEquipmentServiceImpl extends BaseServiceImpl<ProductionEquipmentDao, ProductionEquipmentPO> implements ProductionEquipmentService {

}

