package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("股本结构")
public class CapitalStructure {
    @TableField("证券代码")
    private String stkCd;

    @TableField("统计截止日期")
    private String reptDt;

    @TableField("股本总数")
    private String Nshrttl;

    @TableField("未流通股份")
    private String Nshrnn;

    @TableField("其中：国有股")
    private String Nshrstt;

    @TableField("其中：境外发起人股")
    private String Nshrlpf;

    @TableField("其中：优先股")
    private String Nshrprf;

    @TableField("已流通股份")
    private String Nshrn;

    @TableField("其中：A股流通股")
    private String Nshra;

    @TableField("其中：B股流通股")
    private String Nshrb;

    @TableField("其中：H股流通股")
    private String Nshrh;

    @TableField("其中：其它境外流通股")
    private String Nshroft;
}
