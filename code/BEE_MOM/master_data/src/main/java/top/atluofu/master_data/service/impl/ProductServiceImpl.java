package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.ProductDao;
import top.atluofu.master_data.po.ProductPO;
import top.atluofu.master_data.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * (Product)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:05:08
 */
@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<ProductDao, ProductPO> implements ProductService {

}

