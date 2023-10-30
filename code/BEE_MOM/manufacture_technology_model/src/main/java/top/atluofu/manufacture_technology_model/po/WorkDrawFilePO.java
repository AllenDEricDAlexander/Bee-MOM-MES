package top.atluofu.manufacture_technology_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (WorkDrawFile)表实体类
 *
 * @author atluofu
 * @since 2023-10-30 22:55:15
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("work_draw_file")
public class WorkDrawFilePO extends Model<WorkDrawFilePO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String workDrawFileNo;
    /**
     * manufacture_dispatche_no 格式0000-0000-0000-0000
     */

    private String manufactureTechnologyNo;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String processNo;
    /**
     * process_name
     */

    private String workDrawFileName;
    /**
     * 备注
     */

    private String workDrawFileUrl;
    /**
     * 格式0000-0000-0000-0000
     */

    private String companyStaffReviewNo;
    /**
     * 负责人格式0000-0000-0000-0000
     */

    private String companyStaffHeadNo;
    /**
     * enable status
     */

    private Date issuanceTime;
    /**
     * enable status
     */

    private Integer enableState;
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

