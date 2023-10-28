package top.atluofu.manufacture_model.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.manufacture_model.dao.TechnologyDao;
import top.atluofu.manufacture_model.po.TechnologyPO;
import top.atluofu.manufacture_model.service.TechnologyService;
import org.springframework.stereotype.Service;

/**
 * (Technology)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-28 13:36:20
 */
@Service("technologyService")
public class TechnologyServiceImpl extends BaseServiceImpl<TechnologyDao, TechnologyPO> implements TechnologyService {

}

