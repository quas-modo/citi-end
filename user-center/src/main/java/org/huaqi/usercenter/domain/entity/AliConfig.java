package org.huaqi.usercenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/1/20 16:28
 */
@Data
@TableName("aliconfig")
public class AliConfig {
    @TableId("id")
    private Integer id;

    @TableField("accesskey")
    private String accessKey;

    @TableField("accesssecret")
    private String accessSecret;
}