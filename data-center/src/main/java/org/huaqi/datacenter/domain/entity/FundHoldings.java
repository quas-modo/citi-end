package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/22 20:25
 */
@Data
@TableName("基金持股")
public class FundHoldings {
    @TableField("证券代码")
    private String stkCd;

    @TableField("统计截止日期")
    private String reptDt;

    @TableField("基金代码")
    private String fundCd;

    @TableField("基金名称")
    private String fundNm;

    @TableField("管理公司名称")
    private String mconme;

    @TableField("持有股数")
    private String fundHold;

    @TableField("持股比例")
    private String holdPerct;
}
