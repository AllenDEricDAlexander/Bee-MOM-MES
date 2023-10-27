package top.atluofu.master_data.service.impl;

import top.atluofu.common.service.BaseServiceImpl;
import top.atluofu.master_data.dao.JobDao;
import top.atluofu.master_data.entity.Job;
import top.atluofu.master_data.service.JobService;
import org.springframework.stereotype.Service;

/**
 * (Job)表服务实现类
 *
 * @author atluofu
 * @since 2023-10-26 22:43:59
 */
@Service("jobService")
public class JobServiceImpl extends BaseServiceImpl<JobDao, Job> implements JobService {

}

