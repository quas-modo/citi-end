package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/3/19 22:50
 */
@Data
@TableName("股权投资")
public class StockInvestment {
    @TableField("股票代码")
    private String stkCd;

    @TableField("统计截止日期")
    private String endDate;

    @TableField("投资事件类型编码")
    private String eventTypeCode;

    @TableField("投资事件类型")
    private String eventType;

    @TableField("持有机构名称")
    private String holdInstitutionName;

    @TableField("持有机构类别")
    private String instituionType;

    @TableField("初始投资金额")
    private String initialInvest;

    @TableField("期末持股数量")
    private String endDateAmount;

    @TableField("期末持股比例（百分比）")
    private String endDateRatio;

    @TableField("期末账面余额")
    private String bookValue;

    @TableField("会计核算科目")
    private String accountItem;

    @TableField("投资收益")
    private String investmentReturn;

    @TableField("所有者权益变动额")
    private String ownersEquity;

    @TableField("股份来源")
    private String shareSource;

    @TableField("货币类型")
    private String currency;

    @TableField("说明")
    private String explanation;
}
