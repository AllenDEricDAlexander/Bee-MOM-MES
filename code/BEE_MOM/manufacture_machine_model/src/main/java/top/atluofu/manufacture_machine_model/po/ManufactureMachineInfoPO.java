package top.atluofu.manufacture_machine_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (ManufactureMachineInfo)表实体类
 *
 * @author atluofu
 * @since 2023-11-01 21:38:02
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("manufacture_machine_info")
public class ManufactureMachineInfoPO extends Model<ManufactureMachineInfoPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String machineNo;
    /**
     * process_name
     */

    private String manufactureMachineName;
    /**
     * 备注
     */

    private String manufactureMachineTypeNo;
    /**
     * 123
     */

    private String hazardLevel;
    /**
     * 123
     */

    private String importanceLevel;
    /**
     * pk_id,非自增，业务填写
     */

    private Integer storeAmount;
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

