package top.atluofu.master_data.po;



import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

/**
 * (CompanyStaff)表实体类
 *
 * @author atluofu
 * @since 2023-10-27 09:16:34
 */
@SuppressWarnings("serial")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("company_staff")
public class CompanyStaffPO extends Model<CompanyStaffPO> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Long id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String companyStaffNo;
        /**
      * company_staff_name
      */  
    
    private String companyStaffName;
        /**
      * company_staff_phone
      */  
    
    private String companyStaffPhone;
        /**
      * short name
      */  
    
    private String shortName;
        /**
      * 逻辑外键，role_id
      */  
    
    private Integer roleId;
        /**
      * department_id
      */  
    
    private Integer departmentId;
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

