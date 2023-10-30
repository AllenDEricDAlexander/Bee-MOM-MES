package top.atluofu.manufacture_technology_model.po;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (TechnicalDisciplineProblems)表实体类
 *
 * @author atluofu
 * @since 2023-10-30 22:55:14
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("technical_discipline_problems")
public class TechnicalDisciplineProblemsPO extends Model<TechnicalDisciplineProblemsPO> {
    /**
     * pk_id,非自增，业务填写
     */

    private Long id;
    /**
     * 工序编号格式0000-0000-0000-0000
     */

    private String technicalDisciplineProblemNo;
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

    private String technicalDisciplineProblemName;
    /**
     * 备注
     */

    private String technicalDisciplineProblemMessage;
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

