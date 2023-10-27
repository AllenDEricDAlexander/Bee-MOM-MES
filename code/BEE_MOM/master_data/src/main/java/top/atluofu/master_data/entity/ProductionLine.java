package top.atluofu.master_data.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * (ProductionLine)表实体类
 *
 * @author atluofu
 * @since 2023-10-26 22:46:18
 */
@SuppressWarnings("serial")
public class ProductionLine extends Model<ProductionLine> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Integer id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String productionLineNo;
        /**
      * production_line name
      */  
    
    private String productionLineName;
        /**
      * 逻辑外键，车间id
      */  
    
    private Integer workshopId;
        /**
      * 逻辑外键，负责人id
      */  
    
    private Integer headId;
        /**
      * production_line location
      */  
    
    private String productionLineLocation;
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

    public String getProductionLineNo() {
        return productionLineNo;
    }

    public void setProductionLineNo(String productionLineNo) {
        this.productionLineNo = productionLineNo;
    }

    public String getProductionLineName() {
        return productionLineName;
    }

    public void setProductionLineName(String productionLineName) {
        this.productionLineName = productionLineName;
    }

    public Integer getWorkshopId() {
        return workshopId;
    }

    public void setWorkshopId(Integer workshopId) {
        this.workshopId = workshopId;
    }

    public Integer getHeadId() {
        return headId;
    }

    public void setHeadId(Integer headId) {
        this.headId = headId;
    }

    public String getProductionLineLocation() {
        return productionLineLocation;
    }

    public void setProductionLineLocation(String productionLineLocation) {
        this.productionLineLocation = productionLineLocation;
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

