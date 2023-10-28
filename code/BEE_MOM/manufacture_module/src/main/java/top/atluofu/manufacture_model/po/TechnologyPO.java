package top.atluofu.manufacture_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (Technology)表实体类
 *
 * @author atluofu
 * @since 2023-10-28 13:36:20
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("technology")
public class TechnologyPO extends Model<TechnologyPO> {
    /**
     * PK_id，非自增，业务填写
     */

    private Long id;
    /**
     * technology_no 格式0000-0000-0000-0000
     */

    private String technologyNo;
    /**
     * technology_name
     */

    private String technologyName;
    /**
     * 排序
     */

    private Integer sort;
    /**
     * enable status
     */

    private Integer enableStatus;

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

