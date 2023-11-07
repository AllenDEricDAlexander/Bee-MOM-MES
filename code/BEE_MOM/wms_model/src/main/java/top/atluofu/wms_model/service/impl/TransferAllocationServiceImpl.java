package top.atluofu.wms_model.service.impl;

import org.springframework.stereotype.Service;
import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.wms_model.dao.TransferAllocationDao;
import top.atluofu.wms_model.po.TransferAllocationPO;
import top.atluofu.wms_model.service.TransferAllocationService;

/**
 * (TransferAllocation)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:05
 */
@Service("transferAllocationService")
public class TransferAllocationServiceImpl extends BaseServiceImpl<TransferAllocationDao, TransferAllocationPO> implements TransferAllocationService {

}

