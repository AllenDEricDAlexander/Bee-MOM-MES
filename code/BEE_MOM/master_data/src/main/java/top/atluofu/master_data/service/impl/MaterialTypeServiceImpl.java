package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.MaterialTypeDao;
import top.atluofu.master_data.po.MaterialTypePO;
import top.atluofu.master_data.service.MaterialTypeService;
import org.springframework.stereotype.Service;

/**
 * (MaterialType)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:05:05
 */
@Service("materialTypeService")
public class MaterialTypeServiceImpl extends BaseServiceImpl<MaterialTypeDao, MaterialTypePO> implements MaterialTypeService {

}

