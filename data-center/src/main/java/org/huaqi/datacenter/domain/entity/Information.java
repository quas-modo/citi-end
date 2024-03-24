package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/3/22 21:15
 */
@Data
@TableName("东方财富个股信息")
public class Information {
    @TableField("Total_Market_Value")
    private String totalMarketValue;

    @TableField("Float_Market_Value")
    private String floatMarketValue;

    @TableField("Industry")
    private String industry;

    @TableField("Listing_Date")
    private String listingDate;

    @TableField("Stock_Code")
    private String stkCd;

    @TableField("Stock_Abbreviation")
    private String stkAbbr;

    @TableField("Total_Share_Capital")
    private String totalShareCapital;

    @TableField("Float_Share")
    private String floatShare;
}
