package org.huaqi.datacenter.domain.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/23 19:50
 */
@Data
@TableName("经营能力")
public class ManagerialAbility {
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

    @TableField("应收账款与收入比")
    private String F040101B;

    @TableField("应收账款周转率A")
    private String F040201B;

    @TableField("应收账款周转天数A")
    private String F040301B;

    @TableField("存货与收入比")
    private String F040401B;

    @TableField("存货周转率A")
    private String F040501B;

    @TableField("存货周转天数A")
    private String F040601B;

    @TableField("营业周期A")
    private String F040701B;

    @TableField("应付账款周转率A")
    private String F040801B;

    @TableField("营运资金（资本）周转率A")
    private String F040901B;

    @TableField("现金及现金等价物周转率A")
    private String F041001B;

    @TableField("流动资产与收入比")
    private String F041101B;

    @TableField("流动资产周转率A")
    private String F041201B;

    @TableField("固定资产与收入比")
    private String F041301B;

    @TableField("固定资产周转率A")
    private String F041401B;

    @TableField("非流动资产周转率A")
    private String F041501B;

    @TableField("资本密集度")
    private String F041601B;

    @TableField("总资产周转率A")
    private String F041701B;

    @TableField("股东权益周转率A")
    private String F041801B;
}
