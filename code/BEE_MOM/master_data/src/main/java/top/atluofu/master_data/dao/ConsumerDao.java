package top.atluofu.master_data.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.atluofu.master_data.entity.Consumer;

/**
 * (Consumer)表数据库访问层
 *
 * @author atluofu
 * @since 2023-10-26 22:43:30
 */
public interface ConsumerDao extends BaseMapper<Consumer> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Consumer> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Consumer> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Consumer> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Consumer> entities);

}

