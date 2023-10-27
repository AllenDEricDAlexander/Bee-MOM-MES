package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.MaterialDao;
import top.atluofu.master_data.po.MaterialPO;
import top.atluofu.master_data.service.MaterialService;
import org.springframework.stereotype.Service;

/**
 * (Material)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:05:01
 */
@Service("materialService")
public class MaterialServiceImpl extends BaseServiceImpl<MaterialDao, MaterialPO> implements MaterialService {

}

