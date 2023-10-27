package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (Workshop)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:17:59
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("workshop")
public class WorkshopPO extends Model<WorkshopPO> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Long id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String workshopNo;
        /**
      * workshop name
      */  
    
    private String workshopName;
        /**
      * 逻辑外键，部门或公司 id
      */  
    
    private Integer departmentId;
        /**
      * 逻辑外键，负责人id
      */  
    
    private Integer headId;
        /**
      * workshop area
      */  
    
    private String workshopArea;
        /**
      * enable status
      */  
    
    private Integer enableStatus;
        /**
      * 备注
      */  
    
    private String remarkInfo;
        /**
      * deleted
      */  
    
    private Integer deleted;
        /**
      * create time
      */  
    
    private Date createTime;
        /**
      * update_time
      */  
    
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

