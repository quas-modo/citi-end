package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("资产负债表")
public class BalanceSheet {
    @TableField("证券代码")
    private String stkCd;

    @TableField("证券简称")
    private String shortName;

    @TableField("统计截止日期")
    private String accper;

    @TableField("报表类型")
    private String typrep;

    @TableField("是否发生差错更正")
    private String ifCorrect;

    @TableField("差错更正披露日期")
    private String declareDate;

    @TableField("货币资金")
    private String a001101000;

    @TableField("流动资产合计")
    private String a001100000;

    @TableField("非流动资产合计")
    private String a001200000;

    @TableField("其他资产")
    private String a0f1300000;

    @TableField("资产总计")
    private String a001000000;

    @TableField("流动负债合计")
    private String a002100000;

    @TableField("长期借款")
    private String a002201000;

    @TableField("长期负债合计")
    private String a002206000;

    @TableField("非流动负债合计")
    private String a002200000;

    @TableField("其他负债")
    private String a0f2300000;

    @TableField("负债合计")
    private String a002000000;

    @TableField("实收资本（或股本）")
    private String a003101000;

    @TableField("资本公积")
    private String a003102000;

    @TableField("盈余公积")
    private String a003103000;

    @TableField("未分配利润")
    private String a003105000;

    @TableField("所有者权益合计")
    private String a003000000;

    @TableField("归属于母公司所有者权益合计")
    private String a003100000;
}
