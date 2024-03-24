package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/20 20:14
 */
@Data
@TableName("关联交易")
public class RelatedTransaction {
    @TableField("证券代码")
    private String stkCd;

    @TableField("统计截止日期")
    private String reptDt;

    @TableField("关联方")
    private String repart;

    @TableField("关联关系")
    private String relation;

    @TableField("公告日期")
    private String annoDt;

    @TableField("公告类型")
    private String reptType;

    @TableField("关联关系1")
    private String relation1;

    @TableField("交易性质")
    private String trasub;

    @TableField("交易方向")
    private String direction;

    @TableField("关联交易事项分类")
    private String repat;

    @TableField("关联交易事项")
    private String kind;

    @TableField("货币类型")
    private String curType;

    @TableField("交易序号")
    private Integer transactionRank;

    @TableField("关联交易涉及的金额")
    private String isam;

    @TableField("关联交易涉及的金额比例（百分比）")
    private String pannrsm;

    @TableField("资金费用")
    private String cptcst;

    @TableField("利率")
    private String interest;

    @TableField("期末余额")
    private String isgplo;

    @TableField("交易价格")
    private String price;

    @TableField("交易日期")
    private String trdDt;

    @TableField("交易期限")
    private String tLimit;

    @TableField("交易涉及的银行")
    private String bank;

    @TableField("交易内容")
    private String content;

    @TableField("交易定价原则")
    private String principl;

    @TableField("是否影响公司利润")
    private String ifafcprf;

    @TableField("交易事项对公司利润的影响")
    private String influence;

    @TableField("备注")
    private String notes;
}
