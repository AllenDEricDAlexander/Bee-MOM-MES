package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (Department)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:16:56
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("department")
public class DepartmentPO extends Model<DepartmentPO> {
        /**
      * PK_id，非自增，业务填写
      */  
    
    private Long id;
        /**
      * 上级部门id
      */  
    
    private Integer fatherId;
        /**
      * 部门名称
      */  
    
    private String departmentName;
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

