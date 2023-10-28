package top.atluofu.manufacture_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (ProductionException)表实体类
 *
 * @author atluofu
 * @since 2023-10-28 13:36:19
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("production_exception")
public class ProductionExceptionPO extends Model<ProductionExceptionPO> {
    /**
     * PK_id,非自增,业务填写
     */

    private Long id;
    /**
     * production_exception_no 格式0000-0000-0000-0000
     */

    private String productionExceptionNo;
    /**
     * production_exception_name name
     */

    private String productionExceptionName;
    /**
     * 生产异常类型id
     */

    private Integer productionExceptionTypeNo;
    /**
     * production_order_no 格式0000-0000-0000-0000
     */

    private String productionOrderNo;
    /**
     * work_center_no 格式0000-0000-0000-0000
     */

    private String workCenterNo;
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

