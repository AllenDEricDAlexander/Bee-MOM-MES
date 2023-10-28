package top.atluofu.manufacture_model.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.manufacture_model.dao.ProductionOrderDao;
import top.atluofu.manufacture_model.po.ProductionOrderPO;
import top.atluofu.manufacture_model.service.ProductionOrderService;
import org.springframework.stereotype.Service;

/**
 * (ProductionOrder)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-28 13:36:19
 */
@Service("productionOrderService")
public class ProductionOrderServiceImpl extends BaseServiceImpl<ProductionOrderDao, ProductionOrderPO> implements ProductionOrderService {

}

