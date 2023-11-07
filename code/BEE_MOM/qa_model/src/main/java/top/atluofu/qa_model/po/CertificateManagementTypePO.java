package top.atluofu.qa_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (CertificateManagementType)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:16
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("certificate_management_type")
public class CertificateManagementTypePO extends Model<CertificateManagementTypePO> {
    /**
     * PK_id,非自增,业务填写
     */

    private Long id;
    /**
     * 格式0000-0000-0000-0000
     */

    private String certificateManagementTypeNo;
    /**
     * material_type name
     */

    private String certificateManagementTypeName;
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

