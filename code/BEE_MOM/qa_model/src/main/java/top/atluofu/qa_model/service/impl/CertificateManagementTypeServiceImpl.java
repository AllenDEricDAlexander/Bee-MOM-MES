package top.atluofu.qa_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.qa_model.dao.CertificateManagementTypeDao;
import top.atluofu.qa_model.po.CertificateManagementTypePO;
import top.atluofu.qa_model.service.CertificateManagementTypeService;

/**
 * (CertificateManagementType)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:16
 */
@Service("certificateManagementTypeService")
public class CertificateManagementTypeServiceImpl extends BaseServiceImpl<CertificateManagementTypeDao, CertificateManagementTypePO> implements CertificateManagementTypeService {

}

