package top.atluofu.wms_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.wms_model.dao.ProductionOutboundDao;
import top.atluofu.wms_model.po.ProductionOutboundPO;
import top.atluofu.wms_model.service.ProductionOutboundService;

/**
 * (ProductionOutbound)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:03
 */
@Service("productionOutboundService")
public class ProductionOutboundServiceImpl extends BaseServiceImpl<ProductionOutboundDao, ProductionOutboundPO> implements ProductionOutboundService {

}

