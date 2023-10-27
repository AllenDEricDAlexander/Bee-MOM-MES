package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (Consumer)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:16:50
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("consumer")
public class ConsumerPO extends Model<ConsumerPO> {
        /**
      * pk_id,非自增，业务填写
      */  
    
    private Long id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String consumerNo;
        /**
      * consumer_name
      */  
    
    private String consumerName;
        /**
      * short_name
      */  
    
    private String shortName;
        /**
      * consumer type
      */  
    
    private Integer consumerType;
        /**
      * consumer_phone
      */  
    
    private String consumerPhone;
        /**
      * consumer contact name
      */  
    
    private String consumerContact;
        /**
      * consumer contact phone
      */  
    
    private String concumerContactPhone;
        /**
      * enable status
      */  
    
    private Integer enableStatus;
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

