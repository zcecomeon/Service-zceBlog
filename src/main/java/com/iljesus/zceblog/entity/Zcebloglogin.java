package com.iljesus.zceblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 用户登录表，简单的明文登录。后续升级通过电话验证码注册账号或登录
 * @TableName zcebloglogin
 */
@TableName(value ="zcebloglogin")
@Data
public class Zcebloglogin implements Serializable {
    /**
     * 用户登录账号，一个用户一般只有一个id
     */
    @TableId
    private String userid;

    /**
     * 用户注册账号时必须填用户名，不能为null
     */
    private String username;

    /**
     * 用户密码，简单登录系统，使用明文登录，后续可修改
     */
    private String password;

    /**
     * 是否是后台管理员，默认为false
     */
    private Integer isadmin;

    /**
     * 预留字段，后续扩展使用
     */
    private String optional1;

    /**
     * 预留字段后续扩展使用
     */
    private String optional2;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Zcebloglogin other = (Zcebloglogin) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getIsadmin() == null ? other.getIsadmin() == null : this.getIsadmin().equals(other.getIsadmin()))
            && (this.getOptional1() == null ? other.getOptional1() == null : this.getOptional1().equals(other.getOptional1()))
            && (this.getOptional2() == null ? other.getOptional2() == null : this.getOptional2().equals(other.getOptional2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getIsadmin() == null) ? 0 : getIsadmin().hashCode());
        result = prime * result + ((getOptional1() == null) ? 0 : getOptional1().hashCode());
        result = prime * result + ((getOptional2() == null) ? 0 : getOptional2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", isadmin=").append(isadmin);
        sb.append(", optional1=").append(optional1);
        sb.append(", optional2=").append(optional2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}