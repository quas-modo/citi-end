package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("限售股份")
public class RestrictedShares {
    @TableField("证券代码")
    private String symbol;

    @TableField("截止日期")
    private String endDate;

    @TableField("股东名称")
    private String fullName;

    @TableField("限售原因编码")
    private String reasonID;

    @TableField("限售原因")
    private String reason;

    @TableField("期初持有数量")
    private String beginningShares;

    @TableField("本期增加限售股数")
    private String addShares;

    @TableField("本期解禁数量")
    private String listedShares;

    @TableField("本期解禁日期")
    private String listedDate;

    @TableField("期末持有限售股数")
    private String endShares;

    @TableField("期后第一批解禁数量")
    private String firstListedShares;

    @TableField("期后第一批解禁日期")
    private String firstListedDate;

    @TableField("期后第二批解禁数量")
    private String secondListedShares;

    @TableField("期后第二批解禁日期")
    private String secondListedDate;

    @TableField("期后第三批解禁数量")
    private String thirdListedShares;

    @TableField("期后第三批解禁日期")
    private String thirdListedDate;
}
