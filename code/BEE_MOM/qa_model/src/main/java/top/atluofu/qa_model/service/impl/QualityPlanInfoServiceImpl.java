package top.atluofu.qa_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.qa_model.dao.QualityPlanInfoDao;
import top.atluofu.qa_model.po.QualityPlanInfoPO;
import top.atluofu.qa_model.service.QualityPlanInfoService;

/**
 * (QualityPlanInfo)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:19
 */
@Service("qualityPlanInfoService")
public class QualityPlanInfoServiceImpl extends BaseServiceImpl<QualityPlanInfoDao, QualityPlanInfoPO> implements QualityPlanInfoService {

}

