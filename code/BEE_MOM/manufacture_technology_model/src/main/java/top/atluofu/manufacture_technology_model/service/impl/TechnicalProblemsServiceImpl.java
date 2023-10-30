package top.atluofu.manufacture_technology_model.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.manufacture_technology_model.dao.TechnicalProblemsDao;
import top.atluofu.manufacture_technology_model.po.TechnicalProblemsPO;
import top.atluofu.manufacture_technology_model.service.TechnicalProblemsService;
import org.springframework.stereotype.Service;

/**
 * (TechnicalProblems)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-30 22:55:14
 */
@Service("technicalProblemsService")
public class TechnicalProblemsServiceImpl extends BaseServiceImpl<TechnicalProblemsDao, TechnicalProblemsPO> implements TechnicalProblemsService {

}

