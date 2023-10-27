package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (MaterialType)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:17:24
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("material_type")
public class MaterialTypePO extends Model<MaterialTypePO> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Long id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String materialTypeNo;
        /**
      * material_type name
      */  
    
    private String materialTypeName;
        /**
      * 逻辑外键，上级物料类型id
      */  
    
    private Integer fatherTypeNo;
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

