package top.atluofu.qa_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (QualityPlanInfo)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:20
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("quality_plan_info")
public class QualityPlanInfoPO extends Model<QualityPlanInfoPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * manufacture_dispatche_no 格式0000-0000-0000-0000
     */

    private String qualityPlanNo;
    /**
     * process_name
     */

    private String qualityPlanName;
    /**
     * 备注
     */

    private String qualityPlanDescription;
    /**
     * charge_person_no 格式0000-0000-0000-0000
     */

    private String chargePersonNo;
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

