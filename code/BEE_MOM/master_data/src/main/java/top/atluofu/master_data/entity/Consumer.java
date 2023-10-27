package top.atluofu.master_data.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

/**
 * (Consumer)表实体类
 *
 * @author atluofu
 * @since 2023-10-26 22:43:30
 */
@SuppressWarnings("serial")
public class Consumer extends Model<Consumer> {
        /**
      * pk_id,非自增，业务填写
      */  
    
    private Integer id;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsumerNo() {
        return consumerNo;
    }

    public void setConsumerNo(String consumerNo) {
        this.consumerNo = consumerNo;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getConsumerType() {
        return consumerType;
    }

    public void setConsumerType(Integer consumerType) {
        this.consumerType = consumerType;
    }

    public String getConsumerPhone() {
        return consumerPhone;
    }

    public void setConsumerPhone(String consumerPhone) {
        this.consumerPhone = consumerPhone;
    }

    public String getConsumerContact() {
        return consumerContact;
    }

    public void setConsumerContact(String consumerContact) {
        this.consumerContact = consumerContact;
    }

    public String getConcumerContactPhone() {
        return concumerContactPhone;
    }

    public void setConcumerContactPhone(String concumerContactPhone) {
        this.concumerContactPhone = concumerContactPhone;
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

