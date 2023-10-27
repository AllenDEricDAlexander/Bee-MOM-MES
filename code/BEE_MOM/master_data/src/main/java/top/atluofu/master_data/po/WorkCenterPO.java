package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (WorkCenter)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:17:55
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("work_center")
public class WorkCenterPO extends Model<WorkCenterPO> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Long id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String workCenterNo;
        /**
      * work_center name
      */  
    
    private String workCenterName;
        /**
      * work_center location
      */  
    
    private String workCenterLocation;
        /**
      * 逻辑外键，产线id
      */  
    
    private Integer productionLineId;
        /**
      * 逻辑外键，车间id
      */  
    
    private Integer workshopNo;
        /**
      * 逻辑外键，负责人id
      */  
    
    private Integer headId;
        /**
      * 逻辑外键，工序id
      */  
    
    private Integer productionProcessesId;
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

