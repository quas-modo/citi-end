package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/20 19:00
 * 偿债能力表
 */
@Data
@TableName("偿债能力")
public class DebtServicingCapacity {
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

    @TableField("流动比率")
    private String F010101A;

    @TableField("速动比率")
    private String F010201A;

    @TableField("保守速动比率")
    private String F010301A;

    @TableField("现金比率")
    private String F010401A;

    @TableField("营运资金与借款比")
    private String F010501A;

    @TableField("营运资金")
    private String F010601A;

    @TableField("利息保障倍数A")
    private String F010701B;

    @TableField("经营活动产生的现金流量净额／流动负债")
    private String F010801B;

    @TableField("现金流利息保障倍数")
    private String F010901B;

    @TableField("现金流到期债务保障倍数")
    private String F011001B;

    @TableField("资产负债率")
    private String F011201A;

    @TableField("长期借款与总资产比")
    private String F011301A;

    @TableField("有形资产负债率")
    private String F011401A;

    @TableField("有形资产带息债务比")
    private String F011501A;

    @TableField("权益乘数")
    private String F011601A;

    @TableField("产权比率")
    private String F011701A;

    @TableField("权益对负债比率")
    private String F011801A;

    @TableField("长期资本负债率")
    private String F011901A;

    @TableField("长期负债权益比率")
    private String F012001A;

    @TableField("长期债务与营运资金比率")
    private String F012101A;

    @TableField("息税折旧摊销前利润／负债合计")
    private String F012201B;

    @TableField("经营活动产生的现金流量净额／负债合计")
    private String F012301B;

    @TableField("经营活动产生的现金流量净额／带息债务")
    private String F012401B;

    @TableField("负债与权益市价比率")
    private String F012501B;

    @TableField("有形净值债务率")
    private String F012601B;

    @TableField("固定支出偿付倍数")
    private String F012701B;
}
