package top.atluofu.qa_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (DefectManagement)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:17
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("defect_management")
public class DefectManagementPO extends Model<DefectManagementPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String defectNo;
    /**
     * process_name
     */

    private String defectName;
    /**
     * 备注
     */

    private String defectType;
    /**
     * 工位_no 格式0000-0000-0000-0000
     */

    private String orderNo;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String chargePersonNo;
    /**
     * production_line_no 格式0000-0000-0000-0000
     */

    private String location;
    /**
     * production_line_no 格式0000-0000-0000-0000
     */

    private String handlingMethod;
    /**
     * enable status
     */

    private Integer enableState;
    /**
     * 备注
     */

    private String remarkInfo;
    /**
     * deleted status
     */

    private Integer deleted;

    private Date createTime;

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

