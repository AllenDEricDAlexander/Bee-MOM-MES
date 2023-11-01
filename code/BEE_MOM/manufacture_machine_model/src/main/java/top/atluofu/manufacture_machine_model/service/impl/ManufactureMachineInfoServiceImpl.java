package top.atluofu.manufacture_machine_model.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.manufacture_machine_model.dao.ManufactureMachineInfoDao;
import top.atluofu.manufacture_machine_model.po.ManufactureMachineInfoPO;
import top.atluofu.manufacture_machine_model.service.ManufactureMachineInfoService;
import org.springframework.stereotype.Service;

/**
 * (ManufactureMachineInfo)表服务实现类
 *
 * @author atluofu
 * @since 2023-11-01 21:38:02
 */
@Service("manufactureMachineInfoService")
public class ManufactureMachineInfoServiceImpl extends BaseServiceImpl<ManufactureMachineInfoDao, ManufactureMachineInfoPO> implements ManufactureMachineInfoService {

}

