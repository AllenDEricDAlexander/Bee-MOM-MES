package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.ProductionEquipmentDao;
import top.atluofu.master_data.entity.ProductionEquipment;
import top.atluofu.master_data.service.ProductionEquipmentService;
import org.springframework.stereotype.Service;

/**
 * (ProductionEquipment)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-26 22:46:10
 */
@Service("productionEquipmentService")
public class ProductionEquipmentServiceImpl extends BaseServiceImpl<ProductionEquipmentDao, ProductionEquipment> implements ProductionEquipmentService {

}

