package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/23 20:01
 */
@Data
@TableName("股份质押、冻结或托管情况")
public class StockPledgeFreezeCustody {
    @TableField("证券代码")
    private String stkCd;

    @TableField("统计截止日期")
    private String reptDt;

    @TableField("股东名称")
    private String S0301a;

    @TableField("质押、冻结或托管总股份")
    private String S0302b;

    @TableField("其中：质押数量")
    private String S0303b;

    @TableField("其中：冻结数量")
    private String S0304b;

    @TableField("备注")
    private String notes;

    @TableField("其中：托管股份")
    private String S0305b;
}
