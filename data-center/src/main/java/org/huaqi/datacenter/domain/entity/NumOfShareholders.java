package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/23 19:57
 */
@Data
@TableName("股东人数")
public class NumOfShareholders {
    @TableField("证券代码")
    private String stkCd;

    @TableField("统计截止日期")
    private String reptDt;

    @TableField("股东总数")
    private String S0101;

    @TableField("其中：A股股东总数")
    private String S0101a;

    @TableField("其中：B股股东总数")
    private String S0101b;

    @TableField("其中：H股股东总数")
    private String S0101c;

    @TableField("其中：未流通股东户数")
    private String S0101d;

    @TableField("其中：已流通股东户数")
    private String S0101e;
}
