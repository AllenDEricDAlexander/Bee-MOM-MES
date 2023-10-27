package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.ProductionLineDao;
import top.atluofu.master_data.po.ProductionLinePO;
import top.atluofu.master_data.service.ProductionLineService;
import org.springframework.stereotype.Service;

/**
 * (ProductionLine)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:05:19
 */
@Service("productionLineService")
public class ProductionLineServiceImpl extends BaseServiceImpl<ProductionLineDao, ProductionLinePO> implements ProductionLineService {

}

