package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/22 14:46
 */
@Data
@TableName("十大股东")
public class Top_Ten_Shareholders {
    @TableField("证券代码")
    private String stkCd;

    @TableField("统计截止日期")
    private String reptDt;

    @TableField("股东名称")
    private String S0301a;

    @TableField("持股排名")
    private String S0306a;

    @TableField("持股数量")
    private String S0302a;

    @TableField("股份质押、冻结或托管标识")
    private String S0303a;

    @TableField("持股比例（百分比）")
    private String S0304a;

    @TableField("股份性质")
    private String S0305a;

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

    @TableField("股东性质")
    private String shareholderNature;

    @TableField("未流通股份数量")
    private String unCriculationShares;

    @TableField("期间送转增配股比例")
    private String rightsRatio;

    @TableField("股东类型")
    private String category;
}
