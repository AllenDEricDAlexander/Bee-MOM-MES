package top.atluofu.manufacture_machine_model.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.manufacture_machine_model.dao.RepairTypeDao;
import top.atluofu.manufacture_machine_model.po.RepairTypePO;
import top.atluofu.manufacture_machine_model.service.RepairTypeService;
import org.springframework.stereotype.Service;

/**
 * (RepairType)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-01 21:38:03
 */
@Service("repairTypeService")
public class RepairTypeServiceImpl extends BaseServiceImpl<RepairTypeDao, RepairTypePO> implements RepairTypeService {

}

