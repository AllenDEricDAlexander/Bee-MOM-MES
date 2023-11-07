package top.atluofu.wms_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (ProductionInbound)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:03
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("production_inbound")
public class ProductionInboundPO extends Model<ProductionInboundPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String productionInboundNo;
    /**
     * process_name
     */

    private String productionInboundName;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String warehouseLocation;
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
     * workshop_no 格式0000-0000-0000-0000
     */

    private String materialNo;
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

