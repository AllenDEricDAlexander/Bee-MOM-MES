package top.atluofu.qa_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (ExitInspectionRecordForm)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:47:18
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("exit_inspection_record_form")
public class ExitInspectionRecordFormPO extends Model<ExitInspectionRecordFormPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String exitInspectionRecordNo;
    /**
     * process_name
     */

    private String exitInspectionRecordName;
    /**
     * 备注
     */

    private String exitInspectionRecordDescription;
    /**
     * 工位_no 格式0000-0000-0000-0000
     */

    private String productNo;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String chargePersonNo;
    /**
     * production_line_no 格式0000-0000-0000-0000
     */

    private String qualityInspectorNo;
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

