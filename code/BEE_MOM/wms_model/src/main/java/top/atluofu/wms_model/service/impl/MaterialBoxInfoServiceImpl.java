package top.atluofu.wms_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.wms_model.dao.MaterialBoxInfoDao;
import top.atluofu.wms_model.po.MaterialBoxInfoPO;
import top.atluofu.wms_model.service.MaterialBoxInfoService;

/**
 * (MaterialBoxInfo)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:01
 */
@Service("materialBoxInfoService")
public class MaterialBoxInfoServiceImpl extends BaseServiceImpl<MaterialBoxInfoDao, MaterialBoxInfoPO> implements MaterialBoxInfoService {

}

