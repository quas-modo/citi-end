package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/3/21 11:59
 */
@Data
@TableName("关键指标")
public class KPI {
    @TableField("股票代码")
    private String stkCd;

    @TableField("报告期")
    private String date;

    @TableField("净利润")
    private String netProfit;

    @TableField("净利润同比增长率")
    private String netProfitGrowthRate;

    @TableField("扣非净利润")
    private String nonNetProfit;

    @TableField("扣非净利润同比增长率")
    private String nonNetProfitGrowthRate;

    @TableField("营业总收入")
    private String totalRevenue;

    @TableField("营业总收入同比增长率")
    private String totalRevenueGrowthRate;

    @TableField("基本每股收益")
    private String basicEarningsPerShare;

    @TableField("每股净资产")
    private String netAssetsPerShare;

    @TableField("每股资本公积金")
    private String capitalReservePerShare;

    @TableField("每股未分配利润")
    private String undistributedProfitPerShare;

    @TableField("每股经营现金流")
    private String operatingCashFlowPerShare;

    @TableField("销售净利率")
    private String netProfitMargin;

    @TableField("销售毛利率")
    private String grossProfitMargin;

    @TableField("净资产收益率")
    private String returnOnEquity;

    @TableField("净资产收益率_摊薄")
    private String returnOnEquityDiluted;

    @TableField("营业周期")
    private String businessCycle;

    @TableField("存货周转率")
    private String inventoryTurnover;

    @TableField("存货周转天数")
    private String inventoryTurnoverDays;

    @TableField("应收账款周转天数")
    private String accountsReceivableTurnoverDays;

    @TableField("流动比率")
    private String currentRatio;

    @TableField("速动比率")
    private String quickRatio;

    @TableField("保守速动比率")
    private String conservativeQuickRatio;

    @TableField("产权比率")
    private String equityRatio;

    @TableField("资产负债率")
    private String debtToAssetsRatio;
}
