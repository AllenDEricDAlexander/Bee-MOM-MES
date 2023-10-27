package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.WorkshopDao;
import top.atluofu.master_data.entity.Workshop;
import top.atluofu.master_data.service.WorkshopService;
import org.springframework.stereotype.Service;

/**
 * (Workshop)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-26 22:47:06
 */
@Service("workshopService")
public class WorkshopServiceImpl extends BaseServiceImpl<WorkshopDao, Workshop> implements WorkshopService {

}

