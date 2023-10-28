package top.atluofu.manufacture_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (ReportWork)表实体类
 *
 * @author atluofu
 * @since 2023-10-28 13:36:19
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("report_work")
public class ReportWorkPO extends Model<ReportWorkPO> {
    /**
     * PK_id,非自增,业务填写
     */

    private Long id;
    /**
     * report_work_type 格式0000-0000-0000-0000
     */

    private String reportWorkType;
    /**
     * work_center_no 格式0000-0000-0000-0000
     */

    private String workCenterNo;
    /**
     * production_line_no 格式0000-0000-0000-0000
     */

    private String productionLineNo;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String workshopNo;
    /**
     * department_id 格式0000-0000-0000-0000
     */

    private String departmentId;
    /**
     * production_order_no 格式0000-0000-0000-0000
     */

    private String productionOrderNo;
    /**
     * consumer_no 格式0000-0000-0000-0000
     */

    private String consumerNo;
    /**
     * product_no 格式0000-0000-0000-0000
     */

    private String productNo;
    /**
     * product name
     */

    private String productName;
    /**
     * specification
     */

    private String specification;
    /**
     * execution_unit_no 格式0000-0000-0000-0000 user or machine
     */

    private String executionUnitNo;
    /**
     * report_time
     */

    private Date reportTime;
    /**
     * 审核人user_no 格式0000-0000-0000-0000
     */

    private String userNo;
    /**
     * enable status
     */

    private Integer enableStatus;
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

