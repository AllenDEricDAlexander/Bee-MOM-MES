package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (Product)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:17:28
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("product")
public class ProductPO extends Model<ProductPO> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Long id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String productNo;
        /**
      * product name
      */  
    
    private String productName;
        /**
      * unit
      */  
    
    private String unit;
        /**
      * 逻辑外键，物料类型id
      */  
    
    private Integer productTypeNo;
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

