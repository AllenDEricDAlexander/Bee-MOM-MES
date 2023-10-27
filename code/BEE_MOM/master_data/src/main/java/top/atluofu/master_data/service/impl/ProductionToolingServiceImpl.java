package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.ProductionToolingDao;
import top.atluofu.master_data.entity.ProductionTooling;
import top.atluofu.master_data.service.ProductionToolingService;
import org.springframework.stereotype.Service;

/**
 * (ProductionTooling)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-26 22:46:28
 */
@Service("productionToolingService")
public class ProductionToolingServiceImpl extends BaseServiceImpl<ProductionToolingDao, ProductionTooling> implements ProductionToolingService {

}

