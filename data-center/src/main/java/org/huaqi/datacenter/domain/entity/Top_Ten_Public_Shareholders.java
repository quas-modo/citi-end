package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/22 14:32
 */
@Data
@TableName("十大流通股东")
public class Top_Ten_Public_Shareholders {
    @TableField("证券代码")
    private String stkCd;

    @TableField("统计截止日期")
    private String reptDt;

    @TableField("股东名称")
    private String S0401a;

    @TableField("持股排名")
    private String S0404a;

    @TableField("持股数量")
    private String S0402a;

    @TableField("股份性质")
    private String S0403a;

    @TableField("变动方向")
    private String changeType;

    @TableField("变动数量")
    private String changeNum;

    @TableField("变动比例（百分比）")
    private String changePercentage;

    @TableField("变动数量占总股本比例（百分比）")
    private String changeNumPercentage;

    @TableField("变动起始日期")
    private String changeStartDate;

    @TableField("持股比例")
    private String shareholdingRatio;

    @TableField("持股数占流通股总股数比例")
    private String sharesTradSharesRatio;

    @TableField("持股数占流通A股数比例")
    private String sharesTradASharesRatio;
}
