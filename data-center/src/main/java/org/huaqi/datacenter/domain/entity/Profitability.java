package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/23 19:39
 */
@Data
@TableName("盈利能力")
public class Profitability {
    @TableField("股票代码")
    private String stkCd;

    @TableField("股票简称")
    private String shortName;

    @TableField("统计截止日期")
    private String accper;

    @TableField("报表类型编码")
    private String typrep;

    @TableField("公告来源")
    private String source;

    @TableField("资产报酬率A")
    private String F050101B;

    @TableField("总资产净利润率（ROA）A")
    private String F050201B;

    @TableField("流动资产净利润率A")
    private String F050301B;

    @TableField("固定资产净利润率A")
    private String F050401B;

    @TableField("净资产收益率（ROE）A")
    private String F050501B;

    @TableField("息税前利润（EBIT）")
    private String F050601B;

    @TableField("息前税后利润")
    private String F050701B;

    @TableField("息税折旧摊销前收入（EBITDA）")
    private String F050801B;

    @TableField("净利润与利润总额比")
    private String F050901B;

    @TableField("利润总额与息税前利润相比")
    private String F051001B;

    @TableField("息税前利润与资产总额比")
    private String F051101B;

    @TableField("投入资本回报率（ROIC）")
    private String F051201B;

    @TableField("长期资本收益率")
    private String F053201B;

    @TableField("营业毛利率")
    private String F053301B;

    @TableField("营业成本率")
    private String F051301B;

    @TableField("营业利润率")
    private String F051401B;

    @TableField("营业净利率")
    private String F051501B;

    @TableField("总营业成本率")
    private String F051601B;

    @TableField("销售费用率")
    private String F051701B;

    @TableField("管理费用率")
    private String F051801B;

    @TableField("财务费用率")
    private String F051901B;

    @TableField("研发费用率")
    private Double F053401B;

    @TableField("销售期间费用率")
    private String F052001B;

    @TableField("成本费用利润率")
    private String F052101B;

    @TableField("资产减值损失／营业收入")
    private String F052201B;

    @TableField("息税折旧摊销前营业利润率")
    private String F052301B;

    @TableField("息税前营业利润率")
    private String F052401B;

    @TableField("现金与利润总额比")
    private String F052901B;

    @TableField("归属于母公司净资产收益率（ROE）A")
    private String F053001B;

    @TableField("归属于母公司综合收益率A")
    private String F053101B;

    @TableField("投资收益率")
    private String F053202B;
}
