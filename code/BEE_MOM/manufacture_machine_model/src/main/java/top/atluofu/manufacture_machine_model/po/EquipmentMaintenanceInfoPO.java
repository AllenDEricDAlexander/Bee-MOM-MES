package top.atluofu.manufacture_machine_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (EquipmentMaintenanceInfo)表实体类
 *
 * @author atluofu
 * @since 2023-11-01 21:38:02
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("equipment_maintenance_info")
public class EquipmentMaintenanceInfoPO extends Model<EquipmentMaintenanceInfoPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * manufacture_dispatche_no 格式0000-0000-0000-0000
     */

    private String equipmentMaintenanceNo;
    /**
     * 备注
     */

    private String manufactureMachineNo;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String headerNo;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String manageNo;

    private Date startTime;

    private Date endTime;
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

