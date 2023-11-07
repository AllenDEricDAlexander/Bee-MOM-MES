package top.atluofu.wms_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (WarehouseManagement)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:05
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("warehouse_management")
public class WarehouseManagementPO extends Model<WarehouseManagementPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String warehouseNo;
    /**
     * process_name
     */

    private String warehouseName;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String warehouseLocation;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String chargePersonNo;

    private Integer maxCapacity;

    private Integer remainingCapacity;
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

