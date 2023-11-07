package top.atluofu.wms_model.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.atluofu.wms_model.po.CallForMaterialInfoPO;

/**
 * (CallForMaterialInfo)表数据库访问层
 *
 * @author atluofu
 * @since 2023-11-07 08:56:01
 */
public interface CallForMaterialInfoDao extends BaseMapper<CallForMaterialInfoPO> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CallForMaterialInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CallForMaterialInfoPO> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CallForMaterialInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CallForMaterialInfoPO> entities);

}

