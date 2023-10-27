package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.CompanyStaffDao;
import top.atluofu.master_data.po.CompanyStaffPO;
import top.atluofu.master_data.service.CompanyStaffService;
import org.springframework.stereotype.Service;

/**
 * (CompanyStaff)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:04:40
 */
@Service("companyStaffService")
public class CompanyStaffServiceImpl extends BaseServiceImpl<CompanyStaffDao, CompanyStaffPO> implements CompanyStaffService {

}

