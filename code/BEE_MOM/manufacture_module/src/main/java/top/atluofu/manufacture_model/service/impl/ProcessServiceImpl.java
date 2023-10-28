package top.atluofu.manufacture_model.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.manufacture_model.dao.ProcessDao;
import top.atluofu.manufacture_model.po.ProcessPO;
import top.atluofu.manufacture_model.service.ProcessService;
import org.springframework.stereotype.Service;

/**
 * (Process)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-28 13:36:18
 */
@Service("processService")
public class ProcessServiceImpl extends BaseServiceImpl<ProcessDao, ProcessPO> implements ProcessService {

}

