package top.atluofu.qa_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.qa_model.dao.DefectManagementDao;
import top.atluofu.qa_model.po.DefectManagementPO;
import top.atluofu.qa_model.service.DefectManagementService;

/**
 * (DefectManagement)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:16
 */
@Service("defectManagementService")
public class DefectManagementServiceImpl extends BaseServiceImpl<DefectManagementDao, DefectManagementPO> implements DefectManagementService {

}

