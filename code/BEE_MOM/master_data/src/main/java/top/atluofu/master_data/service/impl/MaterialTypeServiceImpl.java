package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.MaterialTypeDao;
import top.atluofu.master_data.entity.MaterialType;
import top.atluofu.master_data.service.MaterialTypeService;
import org.springframework.stereotype.Service;

/**
 * (MaterialType)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-26 22:44:30
 */
@Service("materialTypeService")
public class MaterialTypeServiceImpl extends BaseServiceImpl<MaterialTypeDao, MaterialType> implements MaterialTypeService {

}

