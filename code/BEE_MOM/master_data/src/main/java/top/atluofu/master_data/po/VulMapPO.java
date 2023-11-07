package top.atluofu.master_data.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (VulMap)表实体类
 *
 * @author atluofu
 * @since 2023-11-06 15:30:39
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("vul_map")
public class VulMapPO extends Model<VulMapPO> {

    private Integer id;

    private String vulName;

    private String vulTypeName;

    private String vulRisk;

    private String vulState;

    private Date createDate;

    private Date updateDate;

    private Integer delFlag;

    private Integer tenantId;


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

