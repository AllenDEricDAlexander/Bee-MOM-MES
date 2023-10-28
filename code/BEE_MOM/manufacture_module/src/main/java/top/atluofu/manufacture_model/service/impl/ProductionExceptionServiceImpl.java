package top.atluofu.manufacture_model.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.manufacture_model.dao.ProductionExceptionDao;
import top.atluofu.manufacture_model.po.ProductionExceptionPO;
import top.atluofu.manufacture_model.service.ProductionExceptionService;
import org.springframework.stereotype.Service;

/**
 * (ProductionException)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-28 13:36:18
 */
@Service("productionExceptionService")
public class ProductionExceptionServiceImpl extends BaseServiceImpl<ProductionExceptionDao, ProductionExceptionPO> implements ProductionExceptionService {

}

