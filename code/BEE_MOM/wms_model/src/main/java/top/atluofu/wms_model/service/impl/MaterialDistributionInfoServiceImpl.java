package top.atluofu.wms_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.wms_model.dao.MaterialDistributionInfoDao;
import top.atluofu.wms_model.po.MaterialDistributionInfoPO;
import top.atluofu.wms_model.service.MaterialDistributionInfoService;

/**
 * (MaterialDistributionInfo)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:02
 */
@Service("materialDistributionInfoService")
public class MaterialDistributionInfoServiceImpl extends BaseServiceImpl<MaterialDistributionInfoDao, MaterialDistributionInfoPO> implements MaterialDistributionInfoService {

}

