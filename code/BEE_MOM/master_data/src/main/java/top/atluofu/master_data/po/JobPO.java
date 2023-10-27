package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (Job)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:17:16
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("job")
public class JobPO extends Model<JobPO> {
        /**
      * PK_id，非自增，业务填写
      */  
    
    private Long id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String jobNo;
        /**
      * job name
      */  
    
    private String jobName;
        /**
      * job code
      */  
    
    private String jobCode;
        /**
      * job status 0 正常 1 缺人 2 禁用
      */  
    
    private Integer jobStatus;
        /**
      * 需要人数
      */  
    
    private Integer requireNumber;
        /**
      * 当前人数
      */  
    
    private Integer currentNumber;
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

