package top.atluofu.manufacture_model.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.atluofu.manufacture_model.po.TechnologyPO;

/**
 * (Technology)表数据库访问层
 *
 * @author atluofu
 * @since 2023-10-28 13:36:20
 */
public interface TechnologyDao extends BaseMapper<TechnologyPO> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Technology> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TechnologyPO> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Technology> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<TechnologyPO> entities);

}

