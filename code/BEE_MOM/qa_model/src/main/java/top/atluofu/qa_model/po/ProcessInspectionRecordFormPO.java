package top.atluofu.qa_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (ProcessInspectionRecordForm)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:19
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("process_inspection_record_form")
public class ProcessInspectionRecordFormPO extends Model<ProcessInspectionRecordFormPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String processInspectionRecordNo;
    /**
     * process_name
     */

    private String processInspectionRecordName;
    /**
     * 备注
     */

    private String processInspectionRecordDescription;
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
     * technology_no 格式0000-0000-0000-0000
     */

    private String technologyNo;
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

