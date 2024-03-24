package org.huaqi.usercenter.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author whm
 * @date 2024/1/20 15:56
 */
@Data
@TableName("user")
public class User {
    @TableId(value = "userId", type = IdType.AUTO)
    private Long userId;

    @TableField("username")
    private String userName;

    @TableField("password")
    private String password;

    @TableField("phone")
    private String phone;

    @TableField("create_time")
    private Date createTime;

    @TableField("last_login_time")
    private Date lastLoginTime;

    @TableField("avatar")
    private String avatar;
}
