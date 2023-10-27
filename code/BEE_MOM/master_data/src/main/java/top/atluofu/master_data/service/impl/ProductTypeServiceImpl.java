package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.ProductTypeDao;
import top.atluofu.master_data.entity.ProductType;
import top.atluofu.master_data.service.ProductTypeService;
import org.springframework.stereotype.Service;

/**
 * (ProductType)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-26 22:46:00
 */
@Service("productTypeService")
public class ProductTypeServiceImpl extends BaseServiceImpl<ProductTypeDao, ProductType> implements ProductTypeService {

}

