package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (Supplier)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:17:52
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("supplier")
public class SupplierPO extends Model<SupplierPO> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Long id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String supplierNo;
        /**
      * supplier name
      */  
    
    private String supplierName;
        /**
      * short name
      */  
    
    private String shortName;
        /**
      * grade
      */  
    
    private Integer supplierGrade;
        /**
      * score
      */  
    
    private Integer supplierScore;
        /**
      * supplier_phone
      */  
    
    private String supplierPhone;
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

