package top.atluofu.manufacture_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (Process)表实体类
 *
 * @author atluofu
 * @since 2023-10-28 13:36:18
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("process")
public class ProcessPO extends Model<ProcessPO> {
    /**
     * PK_id，非自增，业务填写
     */

    private Long id;
    /**
     * 格式0000-0000-0000-0000
     */

    private String processNo;
    /**
     * process_name
     */

    private String processName;
    /**
     * process_status 0 正常 1 缺人 2 禁用
     */

    private Integer processStatus;
    /**
     * 备注
     */

    private String remark;

    private Integer deleted;

    private Date createTime;

    private Date deletedTime;
    /**
     * 逻辑外键，部门id
     */

    private Integer departmentId;


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

