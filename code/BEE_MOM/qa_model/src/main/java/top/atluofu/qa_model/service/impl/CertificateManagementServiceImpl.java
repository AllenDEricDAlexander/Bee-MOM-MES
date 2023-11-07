package top.atluofu.qa_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.qa_model.dao.CertificateManagementDao;
import top.atluofu.qa_model.po.CertificateManagementPO;
import top.atluofu.qa_model.service.CertificateManagementService;

/**
 * (CertificateManagement)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:16
 */
@Service("certificateManagementService")
public class CertificateManagementServiceImpl extends BaseServiceImpl<CertificateManagementDao, CertificateManagementPO> implements CertificateManagementService {

}

