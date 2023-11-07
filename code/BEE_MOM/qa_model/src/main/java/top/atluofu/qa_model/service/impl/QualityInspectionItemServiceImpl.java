package top.atluofu.qa_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.qa_model.dao.QualityInspectionItemDao;
import top.atluofu.qa_model.po.QualityInspectionItemPO;
import top.atluofu.qa_model.service.QualityInspectionItemService;

/**
 * (QualityInspectionItem)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:19
 */
@Service("qualityInspectionItemService")
public class QualityInspectionItemServiceImpl extends BaseServiceImpl<QualityInspectionItemDao, QualityInspectionItemPO> implements QualityInspectionItemService {

}

