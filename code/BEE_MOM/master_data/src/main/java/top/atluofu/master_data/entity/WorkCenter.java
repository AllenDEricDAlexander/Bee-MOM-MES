package top.atluofu.master_data.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * (WorkCenter)表实体类
 *
 * @author atluofu
 * @since 2023-10-26 22:47:00
 */
@SuppressWarnings("serial")
public class WorkCenter extends Model<WorkCenter> {
        /**
      * PK_id,非自增,业务填写
      */  
    
    private Integer id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String workCenterNo;
        /**
      * work_center name
      */  
    
    private String workCenterName;
        /**
      * work_center location
      */  
    
    private String workCenterLocation;
        /**
      * 逻辑外键，产线id
      */  
    
    private Integer productionLineId;
        /**
      * 逻辑外键，车间id
      */  
    
    private Integer workshopNo;
        /**
      * 逻辑外键，负责人id
      */  
    
    private Integer headId;
        /**
      * 逻辑外键，工序id
      */  
    
    private Integer productionProcessesId;
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

    public String getWorkCenterNo() {
        return workCenterNo;
    }

    public void setWorkCenterNo(String workCenterNo) {
        this.workCenterNo = workCenterNo;
    }

    public String getWorkCenterName() {
        return workCenterName;
    }

    public void setWorkCenterName(String workCenterName) {
        this.workCenterName = workCenterName;
    }

    public String getWorkCenterLocation() {
        return workCenterLocation;
    }

    public void setWorkCenterLocation(String workCenterLocation) {
        this.workCenterLocation = workCenterLocation;
    }

    public Integer getProductionLineId() {
        return productionLineId;
    }

    public void setProductionLineId(Integer productionLineId) {
        this.productionLineId = productionLineId;
    }

    public Integer getWorkshopNo() {
        return workshopNo;
    }

    public void setWorkshopNo(Integer workshopNo) {
        this.workshopNo = workshopNo;
    }

    public Integer getHeadId() {
        return headId;
    }

    public void setHeadId(Integer headId) {
        this.headId = headId;
    }

    public Integer getProductionProcessesId() {
        return productionProcessesId;
    }

    public void setProductionProcessesId(Integer productionProcessesId) {
        this.productionProcessesId = productionProcessesId;
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

