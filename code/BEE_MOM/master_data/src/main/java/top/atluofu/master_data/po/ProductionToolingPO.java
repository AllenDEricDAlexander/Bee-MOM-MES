package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (ProductionTooling)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:17:45
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("production_tooling")
public class ProductionToolingPO extends Model<ProductionToolingPO> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Long id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String productionToolingNo;
        /**
      * production_tooling name
      */  
    
    private String productionToolingName;
        /**
      * 逻辑外键，production_tooling type
      */  
    
    private Integer productionToolingTypeNo;
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

