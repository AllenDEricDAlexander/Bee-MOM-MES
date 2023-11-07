package top.atluofu.qa_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (QualityInspectionItem)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:19
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("quality_inspection_item")
public class QualityInspectionItemPO extends Model<QualityInspectionItemPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String qualityInspectionItemNo;
    /**
     * process_name
     */

    private String qualityInspectionItemName;
    /**
     * 备注
     */

    private String qualityInspectionItemDescription;
    /**
     * 工位_no 格式0000-0000-0000-0000
     */

    private String qualityStationNo;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String workshopNo;
    /**
     * production_line_no 格式0000-0000-0000-0000
     */

    private String productionLineNo;
    /**
     * department_no 格式0000-0000-0000-0000
     */

    private String departmentNo;
    /**
     * creator_no 格式0000-0000-0000-0000
     */

    private String creatorNo;
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

