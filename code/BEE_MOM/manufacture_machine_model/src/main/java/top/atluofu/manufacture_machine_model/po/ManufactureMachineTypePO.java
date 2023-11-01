package top.atluofu.manufacture_machine_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (ManufactureMachineType)表实体类
 *
 * @author atluofu
 * @since 2023-11-01 21:38:03
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("manufacture_machine_type")
public class ManufactureMachineTypePO extends Model<ManufactureMachineTypePO> {
    /**
     * PK_id,非自增,业务填写
     */

    private Long id;
    /**
     * 格式0000-0000-0000-0000
     */

    private String manufactureMachineTypeNo;
    /**
     * material_type name
     */

    private String manufactureMachineTypeName;
    /**
     * 逻辑外键，上级物料类型id
     */

    private Integer fatherTypeNo;
    /**
     * 备注
     */

    private String remarkInfo;
    /**
     * deleted
     */

    private Integer deleted;
    /**
     * create time
     */

    private Date createTime;
    /**
     * update_time
     */

    private Date updateTime;


    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.id;
    }
}

