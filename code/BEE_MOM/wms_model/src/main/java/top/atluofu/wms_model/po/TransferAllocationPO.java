package top.atluofu.wms_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (TransferAllocation)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:05
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("transfer_allocation")
public class TransferAllocationPO extends Model<TransferAllocationPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String transferAllocationNo;
    /**
     * process_name
     */

    private String transferAllocationName;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String fromLocation;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String toLocation;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String chargePersonNo;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String inspectorNo;
    /**
     * enable status
     */

    private Integer approvalState;

    private Integer quantity;
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

