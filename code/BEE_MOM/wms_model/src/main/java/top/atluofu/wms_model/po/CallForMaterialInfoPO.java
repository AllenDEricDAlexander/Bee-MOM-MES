package top.atluofu.wms_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (CallForMaterialInfo)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:01
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("call_for_material_info")
public class CallForMaterialInfoPO extends Model<CallForMaterialInfoPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String bufferCallForMaterialNo;
    /**
     * process_name
     */

    private String bufferCallForMaterialName;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String bufferCallForMaterialLocation;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String chargePersonNo;
    /**
     * enable status
     */

    private Integer enableState;

    private Integer amount;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String materialBoxNo;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String materialDistributionNo;
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

