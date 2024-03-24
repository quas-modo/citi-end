package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("限售解禁")
public class RestrictedSale {
    @TableField("公司ID")
    private String institutionID;

    @TableField("股票代码")
    private String stkCd;

    @TableField("股东序号")
    private String rank_;

    @TableField("股东名称")
    private String shareholderName;

    @TableField("解禁日期")
    private String circulationDate;

    @TableField("解禁数量")
    private String circulationShares;

    @TableField("实际解禁日期")
    private String listedDate;

    @TableField("实际解禁数量")
    private String listedShares;

    @TableField("总限售股数")
    private String lockShares;

    @TableField("本期解禁流通股数占总限售股比例")
    private String proportion;

    @TableField("解禁股份类型")
    private String listedSharesType;

    @TableField("数据来源")
    private String source;
}
