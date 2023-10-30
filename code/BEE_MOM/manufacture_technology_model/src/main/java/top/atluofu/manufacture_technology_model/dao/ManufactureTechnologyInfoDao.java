package top.atluofu.manufacture_technology_model.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.atluofu.manufacture_technology_model.po.ManufactureTechnologyInfoPO;

/**
 * (ManufactureTechnologyInfo)表数据库访问层
 *
 * @author atluofu
 * @since 2023-10-30 22:55:13
 */
public interface ManufactureTechnologyInfoDao extends BaseMapper<ManufactureTechnologyInfoPO> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ManufactureTechnologyInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ManufactureTechnologyInfoPO> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ManufactureTechnologyInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ManufactureTechnologyInfoPO> entities);

}

