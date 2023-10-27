package top.atluofu.master_data.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * (ProductionEquipment)表实体类
 *
 * @author atluofu
 * @since 2023-10-26 22:46:10
 */
@SuppressWarnings("serial")
public class ProductionEquipment extends Model<ProductionEquipment> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Integer id;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductionEquipmentNo() {
        return productionEquipmentNo;
    }

    public void setProductionEquipmentNo(String productionEquipmentNo) {
        this.productionEquipmentNo = productionEquipmentNo;
    }

    public String getProductionEquipmentName() {
        return productionEquipmentName;
    }

    public void setProductionEquipmentName(String productionEquipmentName) {
        this.productionEquipmentName = productionEquipmentName;
    }

    public Integer getProductionEquipmentTypeNo() {
        return productionEquipmentTypeNo;
    }

    public void setProductionEquipmentTypeNo(Integer productionEquipmentTypeNo) {
        this.productionEquipmentTypeNo = productionEquipmentTypeNo;
    }

    public Integer getProductionEquipmentNumber() {
        return productionEquipmentNumber;
    }

    public void setProductionEquipmentNumber(Integer productionEquipmentNumber) {
        this.productionEquipmentNumber = productionEquipmentNumber;
    }

    public Integer getHazardLevel() {
        return hazardLevel;
    }

    public void setHazardLevel(Integer hazardLevel) {
        this.hazardLevel = hazardLevel;
    }

    public Integer getImportanceLevel() {
        return importanceLevel;
    }

    public void setImportanceLevel(Integer importanceLevel) {
        this.importanceLevel = importanceLevel;
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

