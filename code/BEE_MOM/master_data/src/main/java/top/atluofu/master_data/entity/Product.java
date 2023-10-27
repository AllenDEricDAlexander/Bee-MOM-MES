package top.atluofu.master_data.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * (Product)表实体类
 *
 * @author atluofu
 * @since 2023-10-26 22:44:39
 */
@SuppressWarnings("serial")
public class Product extends Model<Product> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Integer id;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getProductTypeNo() {
        return productTypeNo;
    }

    public void setProductTypeNo(Integer productTypeNo) {
        this.productTypeNo = productTypeNo;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public String getRemarkInfo() {
        return remarkInfo;
    }

    public void setRemarkInfo(String remarkInfo) {
        this.remarkInfo = remarkInfo;
    }

    public Integer getdeleted() {
        return deleted;
    }

    public void setdeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

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

