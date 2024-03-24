package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/23 18:24
 */
@Data
@TableName("现金流量表")
public class CashFlow {
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

    @TableField("销售商品、提供劳务收到的现金")
    private String C001001000;

    @TableField("客户存款和同业存放款项净增加额")
    private String C0b1002000;

    @TableField("存放央行和同业款项净减少额")
    private String C0F1023000;

    @TableField("向中央银行借款净增加额")
    private String C0b1003000;

    @TableField("向其他金融机构拆入资金净增加额")
    private String C0b1004000;

    @TableField("收到原保险合同保费取得的现金")
    private String C0i1005000;

    @TableField("收到再保险业务现金净额")
    private String C0i1006000;

    @TableField("保户储金及投资款净增加额")
    private String C0i1007000;

    @TableField("处置交易性金融资产净增加额")
    private String C0d1008000;

    @TableField("收取利息、手续费及佣金的现金")
    private String C0f1009000;

    @TableField("拆入资金净增加额")
    private String C0d1010000;

    @TableField("回购业务资金净增加额")
    private String C0d1011000;

    @TableField("拆出资金净减少额")
    private String C0F1024000;

    @TableField("买入返售款项净减少额")
    private String C0F1025000;

    @TableField("收到的税费返还")
    private String C001012000;

    @TableField("收到的其他与经营活动有关的现金")
    private String C001013000;

    @TableField("经营活动现金流入小计")
    private String C001100000;

    @TableField("购买商品、接受劳务支付的现金")
    private String C001014000;

    @TableField("客户贷款及垫款净增加额")
    private String C0b1015000;

    @TableField("向中央银行借款净减少额")
    private String C0F1026000;

    @TableField("存放中央银行和同业款项净增加额")
    private String C0b1016000;

    @TableField("支付原保险合同赔付款项的现金")
    private String C0i1017000;

    @TableField("支付利息、手续费及佣金的现金")
    private String C0f1018000;

    @TableField("支付再保业务现金净额")
    private String C0F1027000;

    @TableField("保户储金及投资款净减少额")
    private String C0F1028000;

    @TableField("拆出资金净增加额")
    private String C0F1029000;

    @TableField("买入返售款项净增加额")
    private String C0F1030000;

    @TableField("拆入资金净减少额")
    private String C0F1031000;

    @TableField("卖出回购款项净减少额")
    private String C0F1032000;

    @TableField("支付保单红利的现金")
    private String C0i1019000;

    @TableField("支付给职工以及为职工支付的现金")
    private String C001020000;

    @TableField("支付的各项税费")
    private String C001021000;

    @TableField("支付其他与经营活动有关的现金")
    private String C001022000;

    @TableField("经营活动现金流出小计")
    private String C001200000;

    @TableField("经营活动产生的现金流量净额")
    private String C001000000;

    @TableField("收回投资收到的现金")
    private String C002001000;

    @TableField("取得投资收益收到的现金")
    private String C002002000;

    @TableField("处置固定资产、无形资产和其他长期资产收回的现金净额")
    private String C002003000;

    @TableField("处置子公司及其他营业单位收到的现金净额")
    private String C002004000;

    @TableField("收到的其他与投资活动有关的现金")
    private String C002005000;

    @TableField("投资活动产生的现金流入小计")
    private String C002100000;

    @TableField("购建固定资产、无形资产和其他长期资产支付的现金")
    private String C002006000;

    @TableField("投资支付的现金")
    private String C002007000;

    @TableField("质押贷款净增加额")
    private String C0i2008000;

    @TableField("取得子公司及其他营业单位支付的现金净额")
    private String C002009000;

    @TableField("支付其他与投资活动有关的现金")
    private String C002010000;

    @TableField("投资活动产生的现金流出小计")
    private String C002200000;

    @TableField("投资活动产生的现金流量净额")
    private String C002000000;

    @TableField("吸收投资收到的现金")
    private String C003008000;

    @TableField("吸收权益性投资收到的现金")
    private String C003001000;

    @TableField("其中：子公司吸收少数股东投资收到的现金")
    private String C003001101;

    @TableField("发行债券收到的现金")
    private String C003003000;

    @TableField("取得借款收到的现金")
    private String C003002000;

    @TableField("收到其他与筹资活动有关的现金")
    private String C003004000;

    @TableField("筹资活动现金流入小计")
    private String C003100000;

    @TableField("偿还债务支付的现金")
    private String C003005000;

    @TableField("分配股利、利润或偿付利息支付的现金")
    private String C003006000;

    @TableField("其中：子公司支付给少数股东的股利、利润")
    private String C003006101;

    @TableField("支付其他与筹资活动有关的现金")
    private String C003007000;

    @TableField("筹资活动现金流出小计")
    private String C003200000;

    @TableField("筹资活动产生的现金流量净额")
    private String C003000000;

    @TableField("汇率变动对现金及现金等价物的影响")
    private String C004000000;

    @TableField("其他对现金的影响")
    private String C007000000;

    @TableField("现金及现金等价物净增加额")
    private String C005000000;

    @TableField("期初现金及现金等价物余额")
    private String C005001000;

    @TableField("期末现金及现金等价物余额")
    private String C006000000;
}
