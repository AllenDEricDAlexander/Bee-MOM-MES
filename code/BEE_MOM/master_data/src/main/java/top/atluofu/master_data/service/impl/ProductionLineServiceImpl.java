package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.ProductionLineDao;
import top.atluofu.master_data.entity.ProductionLine;
import top.atluofu.master_data.service.ProductionLineService;
import org.springframework.stereotype.Service;

/**
 * (ProductionLine)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-26 22:46:18
 */
@Service("productionLineService")
public class ProductionLineServiceImpl extends BaseServiceImpl<ProductionLineDao, ProductionLine> implements ProductionLineService {

}

