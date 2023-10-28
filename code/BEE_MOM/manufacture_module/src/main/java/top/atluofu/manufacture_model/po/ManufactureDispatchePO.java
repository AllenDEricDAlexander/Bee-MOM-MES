package top.atluofu.manufacture_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (ManufactureDispatche)表实体类
 *
 * @author atluofu
 * @since 2023-10-28 13:36:18
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("manufacture_dispatche")
public class ManufactureDispatchePO extends Model<ManufactureDispatchePO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * manufacture_dispatche_no 格式0000-0000-0000-0000
     */

    private String manufactureDispatcheNo;
    /**
     * production_order_no 格式0000-0000-0000-0000
     */

    private String productionOrderNo;
    /**
     * technology_no 格式0000-0000-0000-0000
     */

    private String technologyNo;
    /**
     * process_no 格式0000-0000-0000-0000
     */

    private String processNo;
    /**
     * production_line_no 格式0000-0000-0000-0000
     */

    private String productionLineNo;
    /**
     * work_center_no 格式0000-0000-0000-0000
     */

    private String workCenterNo;
    /**
     * execution_unit_no 格式0000-0000-0000-0000 user or machine
     */

    private String executionUnitNo;

    private Date startTime;

    private Date closingTime;
    /**
     * enable status
     */

    private Integer enableStatus;
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

