package top.atluofu.manufacture_technology_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (ManufactureProcessInfo)表实体类
 *
 * @author atluofu
 * @since 2023-10-30 22:55:12
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("manufacture_process_info")
public class ManufactureProcessInfoPO extends Model<ManufactureProcessInfoPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String processNo;
    /**
     * process_name
     */

    private String manufactureProcessName;
    /**
     * 备注
     */

    private String manufactureProcessMessage;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String materialNo;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String workshopNo;
    /**
     * production_line_no 格式0000-0000-0000-0000
     */

    private String productionLineNo;
    /**
     * manufacture_dispatche_no 格式0000-0000-0000-0000
     */

    private String manufactureTechnologyNo;
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

