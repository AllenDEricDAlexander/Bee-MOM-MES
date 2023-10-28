package top.atluofu.manufacture_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (ProductionOrder)表实体类
 *
 * @author atluofu
 * @since 2023-10-28 13:36:19
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("production_order")
public class ProductionOrderPO extends Model<ProductionOrderPO> {
    /**
     * PK_id,非自增,业务填写
     */

    private Long id;
    /**
     * production_order_no格式0000-0000-0000-0000
     */

    private String productionOrderNo;
    /**
     * production_order_name
     */

    private String productionOrderName;
    /**
     * work_order_source name
     */

    private String workOrderSource;
    /**
     * ident_no 格式0000-0000-0000-0000
     */

    private String identNo;
    /**
     * product_no 格式0000-0000-0000-0000
     */

    private String productNo;
    /**
     * product_name
     */

    private String productName;
    /**
     * specification
     */

    private String specification;
    /**
     * measuring_unit
     */

    private String measuringUnit;
    /**
     * production_order_quantity
     */

    private Integer productionOrderQuantity;
    /**
     * adjust_quantity
     */

    private Integer adjustQuantity;
    /**
     * produced_quantity
     */

    private Integer producedQuantity;
    /**
     * batch_number
     */

    private Integer batchNumber;
    /**
     * consumer_no 格式0000-0000-0000-0000
     */

    private String consumerNo;
    /**
     * consumer_name
     */

    private String consumerName;
    /**
     * issuing_date
     */

    private Date issuingDate;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String workshopNo;
    /**
     * production_line_no 格式0000-0000-0000-0000
     */

    private String productionLineNo;
    /**
     * document_status
     */

    private Integer documentStatus;
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

