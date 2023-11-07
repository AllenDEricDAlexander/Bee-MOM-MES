package top.atluofu.wms_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (MaterialPlacementPointInfo)表实体类
 *
 * @author atluofu
 * @since 2023-11-07 08:56:02
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("material_placement_point_info")
public class MaterialPlacementPointInfoPO extends Model<MaterialPlacementPointInfoPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String materialPlacementPointNo;
    /**
     * process_name
     */

    private String materialPlacementPointName;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String materialPlacementPointLocation;
    /**
     * workshop_no 格式0000-0000-0000-0000
     */

    private String chargePersonNo;
    /**
     * enable status
     */

    private Integer enableState;

    private Integer maxVolume;
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

