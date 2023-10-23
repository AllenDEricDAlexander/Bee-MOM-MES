package top.atluofu.bee_mom.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Users)表实体类
 *
 * @author atluofu
 * @since 2023-10-23 17:39:54
 */
@SuppressWarnings("serial")
@Data
@Builder
public class Users extends Model<Users> {
    /**
     * user_id，非自增，后端处理传进来
     */

    private Long userId;
    /**
     * user_name，not null 默认生成UUID填充
     */

    private String userName;
    /**
     * follow_count，not null ，默认填充0
     */

    private Long followCount;
    /**
     * follower_count，not null，填充0
     */

    private Long followerCount;
    /**
     * avatarURL，not null 默认填充url
     */

    private String avatarurl;
    /**
     * background_image，notnull 默认填充url
     */

    private String backgroundImage;
    /**
     * signature，not null，默认填充“暂未输入”
     */

    private String signature;
    /**
     * total_favorite,not null ，默认填充0
     */

    private Long totalFavorite;
    /**
     * work_count，not null，默认填充0
     */

    private Long workCount;
    /**
     * favorite_count,not null 默认填充0
     */

    private Long favoriteCount;
    /**
     * password，not null
     */

    private String password;
    /**
     * is_delete，not null 默认填充0
     */

    private Long isDelete;
    /**
     * create_time not null 第一次填充系统时间
     */

    private Date createTime;
    /**
     * update_time not null 更新刷新
     */

    private Date updateTime;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getFollowCount() {
        return followCount;
    }

    public void setFollowCount(Long followCount) {
        this.followCount = followCount;
    }

    public Long getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Long followerCount) {
        this.followerCount = followerCount;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Long getTotalFavorite() {
        return totalFavorite;
    }

    public void setTotalFavorite(Long totalFavorite) {
        this.totalFavorite = totalFavorite;
    }

    public Long getWorkCount() {
        return workCount;
    }

    public void setWorkCount(Long workCount) {
        this.workCount = workCount;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
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
        return this.userId;
    }
}

