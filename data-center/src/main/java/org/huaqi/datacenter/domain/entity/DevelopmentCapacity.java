package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/22 16:55
 */
@Data
@TableName("发展能力")
public class DevelopmentCapacity {
    @TableField("股票代码")
    private String stkCd;

    @TableField("股票简称")
    private String shortName;

    @TableField("统计截止日期")
    private String accper;

    @TableField("报表类型编码")
    private String typreq;

    @TableField("公告来源")
    private String source;

    @TableField("资本保值增值率A")
    private String F080101A;

    @TableField("母公司资本保值增值率")
    private String F080201A;

    @TableField("资本积累率A")
    private String F080301A;

    @TableField("母公司资本积累率")
    private String F080401A;

    @TableField("固定资产增长率A")
    private String F080501A;

    @TableField("总资产增长率A")
    private String F080601A;

    @TableField("净资产收益率增长率A")
    private String F080701B;

    @TableField("基本每股收益增长率A")
    private String F080801B;

    @TableField("稀释每股收益增长率A")
    private String F080901B;

    @TableField("净利润增长率A")
    private String F081001B;

    @TableField("利润总额增长率A")
    private String F081101B;

    @TableField("营业利润增长率A")
    private String F081201B;

    @TableField("归属于母公司净利润增长率")
    private String F081301B;

    @TableField("综合收益增长率")
    private String F081401B;

    @TableField("归属于母公司综合收益增长率")
    private String F081501B;

    @TableField("营业收入增长率A")
    private String F081601B;

    @TableField("营业总收入增长率")
    private String F081701B;

    @TableField("营业总成本增长率")
    private String F081801B;

    @TableField("销售费用增长率")
    private String F081901B;

    @TableField("管理费用增长率")
    private String F082001B;

    @TableField("应计项目")
    private String F082101B;

    @TableField("每股经营活动产生的净流量增长率A")
    private String F082201B;

    @TableField("经营活动产生的净流量增长率A")
    private String F082301B;

    @TableField("投资活动产生的现金流量增长率A")
    private String F082401B;

    @TableField("筹资活动产生的现金流量增长率A")
    private String F082501B;

    @TableField("可持续增长率")
    private String F082601B;

    @TableField("所有者权益增长率A")
    private String F082701A;

    @TableField("每股净资产增长率A")
    private String F082802A;
}
