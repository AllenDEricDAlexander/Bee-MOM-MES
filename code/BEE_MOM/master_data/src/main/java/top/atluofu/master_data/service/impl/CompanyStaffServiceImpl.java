package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.CompanyStaffDao;
import top.atluofu.master_data.entity.CompanyStaff;
import top.atluofu.master_data.service.CompanyStaffService;
import org.springframework.stereotype.Service;

/**
 * (CompanyStaff)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-26 22:35:04
 */
@Service("companyStaffService")
public class CompanyStaffServiceImpl extends BaseServiceImpl<CompanyStaffDao, CompanyStaff> implements CompanyStaffService {

}

