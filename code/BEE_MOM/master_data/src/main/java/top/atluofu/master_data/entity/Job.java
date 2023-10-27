package top.atluofu.master_data.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * (Job)表实体类
 *
 * @author atluofu
 * @since 2023-10-26 22:43:59
 */
@SuppressWarnings("serial")
public class Job extends Model<Job> {
        /**
      * PK_id，非自增，业务填写
      */  
    
    private Integer id;
        /**
      * 格式0000-0000-0000-0000
      */  
    
    private String jobNo;
        /**
      * job name
      */  
    
    private String jobName;
        /**
      * job code
      */  
    
    private String jobCode;
        /**
      * job status 0 正常 1 缺人 2 禁用
      */  
    
    private Integer jobStatus;
        /**
      * 需要人数
      */  
    
    private Integer requireNumber;
        /**
      * 当前人数
      */  
    
    private Integer currentNumber;
        /**
      * 备注
      */  
    
    private String remark;
    
    private Integer deleted;
    
    private Date createTime;
    
    private Date deletedTime;
        /**
      * 逻辑外键，部门id
      */  
    
    private Integer departmentId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobNo() {
        return jobNo;
    }

    public void setJobNo(String jobNo) {
        this.jobNo = jobNo;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public Integer getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Integer jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Integer getRequireNumber() {
        return requireNumber;
    }

    public void setRequireNumber(Integer requireNumber) {
        this.requireNumber = requireNumber;
    }

    public Integer getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(Integer currentNumber) {
        this.currentNumber = currentNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Date getdeletedTime() {
        return deletedTime;
    }

    public void setdeletedTime(Date deletedTime) {
        this.deletedTime = deletedTime;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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

