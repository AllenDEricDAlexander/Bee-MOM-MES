package top.atluofu.qa_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.qa_model.dao.DefectManagementTypeDao;
import top.atluofu.qa_model.po.DefectManagementTypePO;
import top.atluofu.qa_model.service.DefectManagementTypeService;

/**
 * (DefectManagementType)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:17
 */
@Service("defectManagementTypeService")
public class DefectManagementTypeServiceImpl extends BaseServiceImpl<DefectManagementTypeDao, DefectManagementTypePO> implements DefectManagementTypeService {

}

