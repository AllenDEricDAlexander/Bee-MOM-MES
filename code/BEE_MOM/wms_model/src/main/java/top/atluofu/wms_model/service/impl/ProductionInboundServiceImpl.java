package top.atluofu.wms_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.wms_model.dao.ProductionInboundDao;
import top.atluofu.wms_model.po.ProductionInboundPO;
import top.atluofu.wms_model.service.ProductionInboundService;

/**
 * (ProductionInbound)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:02
 */
@Service("productionInboundService")
public class ProductionInboundServiceImpl extends BaseServiceImpl<ProductionInboundDao, ProductionInboundPO> implements ProductionInboundService {

}

