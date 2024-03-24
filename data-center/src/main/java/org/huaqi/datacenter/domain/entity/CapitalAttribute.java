package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("股权性质")
public class CapitalAttribute {
    @TableField("证券代码")
    private String symbol;

    @TableField("证券简称")
    private String shortName;

    @TableField("截止日期")
    private String endDate;

    @TableField("第一大控股股东")
    private String largestHolder;

    @TableField("第一大股东持股比率(百分比)")
    private String largestHolderRate;

    @TableField("前十大股东持股比例(百分比)")
    private String topTenHoldersRate;

    @TableField("实际控制人名称")
    private String actualControllerName;

    @TableField("实际控制人性质编码")
    private String actualControllerNatureID;

    @TableField("实际控制人拥有上市公司股份性质")
    private String sharesNature;

    @TableField("股权性质")
    private String equityNature;

    @TableField("层级判断")
    private String hierarchy;

    @TableField("创始人")
    private String founder;

    @TableField("两权分离率(百分比)")
    private String seperation;

    @TableField("发起人")
    private String originator;
}
