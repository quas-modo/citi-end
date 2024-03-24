package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/21 14:17
 */
@Data
@TableName("利润表")
public class Profit {
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

    @TableField("营业总收入")
    private String B001100000;

    @TableField("营业收入")
    private String B001101000;

    @TableField("利息净收入")
    private String Bbd1102000;

    @TableField("利息收入")
    private String Bbd1102101;

    @TableField("利息支出")
    private String Bbd1102203;

    @TableField("已赚保费")
    private String B0i1103000;

    @TableField("保险业务收入")
    private String B0i1103101;

    @TableField("其中：分保费收入")
    private String B0i1103111;

    @TableField("减：分出保费")
    private String B0i1103203;

    @TableField("减：提取未到期责任准备金")
    private String B0i1103303;

    @TableField("手续费及佣金净收入")
    private String B0d1104000;

    @TableField("其中：代理买卖证券业务净收入")
    private String B0d1104101;

//    @TableField("其中:证券承销业务净收入")
//    private String B0d1104201;

    @TableField("其中：受托客户资产管理业务净收入")
    private String B0d1104301;

    @TableField("手续费及佣金收入")
    private String B0d1104401;

    @TableField("手续费及佣金支出")
    private String B0d1104501;

    @TableField("其他业务收入")
    private String B0f1105000;

    @TableField("营业总成本")
    private String B001200000;

    @TableField("营业成本")
    private String B001201000;

    @TableField("退保金")
    private String B0i1202000;

    @TableField("赔付支出净额")
    private String B0i1203000;

    @TableField("赔付支出")
    private String B0i1203101;

    @TableField("减：摊回赔付支出")
    private String B0i1203203;

    @TableField("提取保险责任准备金净额")
    private String B0i1204000;

    @TableField("提取保险责任准备金")
    private String B0i1204101;

    @TableField("减：摊回保险责任准备金")
    private String B0i1204203;

    @TableField("保单红利支出")
    private String B0i1205000;

    @TableField("分保费用")
    private String B0i1206000;

    @TableField("税金及附加")
    private String B001207000;

    @TableField("业务及管理费")
    private String B0f1208000;

    @TableField("减：摊回分保费用")
    private String B0i1208103;

    @TableField("保险业务手续费及佣金支出")
    private String B0I1214000;

    @TableField("销售费用")
    private String B001209000;

    @TableField("管理费用")
    private String B001210000;

    @TableField("研发费用")
    private String B001216000;

    @TableField("财务费用")
    private String B001211000;

//    @TableField("其中：利息费用(财务费用)")
//    private String B0012110101;

//    @TableField("其中：利息收入(财务费用)")
//    private String B0012110203;

    @TableField("其他收益")
    private String B001305000;

    @TableField("投资收益")
    private String B001302000;

    @TableField("其中：对联营企业和合营企业的投资收益")
    private String B001302101;

    @TableField("其中：以摊余成本计量的金融资产终止确认收益")
    private String B001302201;

    @TableField("汇兑收益")
    private String B001303000;

    @TableField("净敞口套期收益")
    private String B001306000;

    @TableField("公允价值变动收益")
    private String B001301000;

    @TableField("资产减值损失")
    private String B001212000;

    @TableField("信用减值损失")
    private String B001307000;

    @TableField("资产处置收益")
    private String B001308000;

    @TableField("其他业务成本")
    private String B0f1213000;

    @TableField("其他业务利润")
    private String B001304000;

    @TableField("营业利润")
    private String B001300000;

    @TableField("加：营业外收入")
    private String B001400000;

    @TableField("其中：非流动资产处置利得")
    private String B001400101;

    @TableField("减：营业外支出")
    private String B001500000;

    @TableField("其中：非流动资产处置净损益")
    private String B001500101;

    @TableField("其中：非流动资产处置损失")
    private String B001500201;

    @TableField("利润总额")
    private String B001000000;

    @TableField("减：所得税费用")
    private String B002100000;

    @TableField("未确认的投资损失")
    private String B002200000;

    @TableField("影响净利润的其他项目")
    private String B002300000;

    @TableField("净利润")
    private String B002000000;

    @TableField("归属于母公司所有者的净利润")
    private String B002000101;

    @TableField("归属于母公司其他权益工具持有者的净利润")
    private String B002000301;

    @TableField("少数股东损益")
    private String B002000201;

    @TableField("基本每股收益")
    private String B003000000;

    @TableField("稀释每股收益")
    private String B004000000;

//    @TableField("其他综合收益(损失)")
//    private String B005000000;

    @TableField("综合收益总额")
    private String B006000000;

    @TableField("归属于母公司所有者的综合收益")
    private String B006000101;

    @TableField("归属于母公司其他权益工具持有者的综合收益总额")
    private String B006000103;

    @TableField("归属少数股东的综合收益")
    private String B006000102;
}