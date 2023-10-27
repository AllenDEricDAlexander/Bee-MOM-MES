package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.WorkCenterDao;
import top.atluofu.master_data.po.WorkCenterPO;
import top.atluofu.master_data.service.WorkCenterService;
import org.springframework.stereotype.Service;

/**
 * (WorkCenter)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:05:35
 */
@Service("workCenterService")
public class WorkCenterServiceImpl extends BaseServiceImpl<WorkCenterDao, WorkCenterPO> implements WorkCenterService {

}

