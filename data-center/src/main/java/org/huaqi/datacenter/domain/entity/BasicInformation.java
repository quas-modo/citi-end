package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/22 20:11
 */
@Data
@TableName("基本信息")
public class BasicInformation {
    @TableField("股票代码")
    private String stkCd;

    @TableField("股票简称")
    private String shortName;

    @TableField("统计截止日期")
    private String endDate;

    @TableField("证券ID")
    private String securityID;

    @TableField("行业名称")
    private String industryName;

    @TableField("注册具体地址")
    private String registerAddress;

    @TableField("公司办公地址")
    private String officeAddress;

    @TableField("办公地址邮政编码")
    private String zipCode;

    @TableField("董事会秘书")
    private String secretary;

    @TableField("董秘联系电话")
    private String secretaryTel;

    @TableField("董秘传真")
    private String secretaryFax;

    @TableField("董秘电子邮箱")
    private String secretaryEmail;

    @TableField("证券事务代表")
    private String securityConsultant;

    @TableField("重大变更")
    private String sigChange;

    @TableField("中文全称")
    private String fullName;

    @TableField("法人代表")
    private String legalRepresentative;

    @TableField("公司成立日期")
    private String establishDate;

    @TableField("注册资本")
    private String registerCapital;

    @TableField("公司网址")
    private String website;

    @TableField("经营范围")
    private String businessScope;

    @TableField("电子邮箱")
    private String email;

    @TableField("首次上市日期")
    private String listingDate;

    @TableField("所属省份")
    private String province;

    @TableField("所属城市")
    private String city;

    @TableField("主营业务")
    private String mainBusiness;

    @TableField("上市状态")
    private String listingState;
}
