package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/22 20:33
 */
@Data
@TableName("实际控制人")
public class ActualController {
    @TableField("证券代码")
    private String stkCd;

    @TableField("统计截止日期")
    private String reptDt;

    @TableField("判断标准")
    private String S0701a;

    @TableField("直接控股股东名称")
    private String S0702a;

    @TableField("实际控制人名称")
    private String S0701b;

    @TableField("直接控股股东股份性质")
    private String S0703a;

    @TableField("直接控股股东持股比例（百分比）")
    private String S0704a;

    @TableField("直接控股股东持股数量")
    private String S0705a;

    @TableField("实际控制人性质")
    private String S0702b;

    @TableField("实际控制人拥有上市公司股份性质")
    private String S0703b;

    @TableField("实际控制人背景")
    private String S0706b;

    @TableField("备注")
    private String notes;

    @TableField("实际控制人拥有上市公司所有权比例")
    private String S0704b;

    @TableField("实际控制人拥有上市公司控制权比例")
    private String S0704c;

    @TableField("两权分离度（百分比）")
    private String separation;
}
