package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.ConsumerDao;
import top.atluofu.master_data.po.ConsumerPO;
import top.atluofu.master_data.service.ConsumerService;
import org.springframework.stereotype.Service;

/**
 * (Consumer)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-27 09:04:46
 */
@Service("consumerService")
public class ConsumerServiceImpl extends BaseServiceImpl<ConsumerDao, ConsumerPO> implements ConsumerService {

}

