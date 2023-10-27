package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (ProductionEquipment)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:17:36
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("production_equipment")
public class ProductionEquipmentPO extends Model<ProductionEquipmentPO> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Long id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String productionEquipmentNo;
        /**
      * production_equipment name
      */  
    
    private String productionEquipmentName;
        /**
      * 逻辑外键，production_equipment类型id
      */  
    
    private Integer productionEquipmentTypeNo;
        /**
      * production_equipment_number
      */  
    
    private Integer productionEquipmentNumber;
        /**
      * hazard_level
      */  
    
    private Integer hazardLevel;
        /**
      * importance level
      */  
    
    private Integer importanceLevel;
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

