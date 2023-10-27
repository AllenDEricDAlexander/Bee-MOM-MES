package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.DepartmentDao;
import top.atluofu.master_data.po.DepartmentPO;
import top.atluofu.master_data.service.DepartmentService;
import org.springframework.stereotype.Service;

/**
 * (Department)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:04:50
 */
@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<DepartmentDao, DepartmentPO> implements DepartmentService {

}

