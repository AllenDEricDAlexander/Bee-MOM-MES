package top.atluofu.master_data.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.atluofu.master_data.po.SupplierPO;

import java.util.List;

/**
 * (Supplier)表数据库访问层
 *
 * @author atluofu
 * @since 2023-10-27 09:05:31
 */
@Mapper
public interface SupplierDao extends BaseMapper<SupplierPO> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Supplier> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SupplierPO> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Supplier> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SupplierPO> entities);

    List<SupplierPO> getAll(@Param("supplier") SupplierPO supplier);
}

