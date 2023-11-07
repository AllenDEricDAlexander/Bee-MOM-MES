package top.atluofu.master_data.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (VulMapProject)表实体类
 *
 * @author atluofu
 * @since 2023-11-06 15:30:40
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("vul_map_project")
public class VulMapProjectPO extends Model<VulMapProjectPO> {

    private Integer id;

    private Integer projectId;

    private Integer vulMapId;

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

