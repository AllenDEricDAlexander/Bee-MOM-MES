package top.atluofu.master_data.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * (Supplier)表实体类
 *
 * @author atluofu
 * @since 2023-10-26 22:46:52
 */
@SuppressWarnings("serial")
public class Supplier extends Model<Supplier> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Integer id;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getSupplierGrade() {
        return supplierGrade;
    }

    public void setSupplierGrade(Integer supplierGrade) {
        this.supplierGrade = supplierGrade;
    }

    public Integer getSupplierScore() {
        return supplierScore;
    }

    public void setSupplierScore(Integer supplierScore) {
        this.supplierScore = supplierScore;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
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

