package top.atluofu.common.service;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


/**
 * @ClassName: BaseServiceImpl
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-23Day-17:00
 * @Version: 1.0
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {


}
