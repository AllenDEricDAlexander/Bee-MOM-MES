package top.atluofu.wms_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.wms_model.dao.SalesOutboundDao;
import top.atluofu.wms_model.po.SalesOutboundPO;
import top.atluofu.wms_model.service.SalesOutboundService;

/**
 * (SalesOutbound)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:04
 */
@Service("salesOutboundService")
public class SalesOutboundServiceImpl extends BaseServiceImpl<SalesOutboundDao, SalesOutboundPO> implements SalesOutboundService {

}

