package top.atluofu.master_data.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * (CompanyStaff)表实体类
 *
 * @author atluofu
 * @since 2023-10-26 22:35:04
 */
@SuppressWarnings("serial")
public class CompanyStaff extends Model<CompanyStaff> {
    /**
     * PK_id,非自增,业务填写
     */

    private Integer id;
    /**
     * 格式0000-0000-0000-0000
     */

    private String pcompanyStaffNo;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPcompanyStaffNo() {
        return pcompanyStaffNo;
    }

    public void setPcompanyStaffNo(String pcompanyStaffNo) {
        this.pcompanyStaffNo = pcompanyStaffNo;
    }

    public String getCompanyStaffName() {
        return companyStaffName;
    }

    public void setCompanyStaffName(String companyStaffName) {
        this.companyStaffName = companyStaffName;
    }

    public String getCompanyStaffPhone() {
        return companyStaffPhone;
    }

    public void setCompanyStaffPhone(String companyStaffPhone) {
        this.companyStaffPhone = companyStaffPhone;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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

