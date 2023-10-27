package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.ProductionToolingDao;
import top.atluofu.master_data.po.ProductionToolingPO;
import top.atluofu.master_data.service.ProductionToolingService;
import org.springframework.stereotype.Service;

/**
 * (ProductionTooling)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:05:22
 */
@Service("productionToolingService")
public class ProductionToolingServiceImpl extends BaseServiceImpl<ProductionToolingDao, ProductionToolingPO> implements ProductionToolingService {

}

