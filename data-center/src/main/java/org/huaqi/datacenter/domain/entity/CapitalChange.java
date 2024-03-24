package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("股权变更")
public class CapitalChange {
    @TableField("证券代码")
    private String stkCd;

    @TableField("股份增持方")
    private String S0801a;

    @TableField("股份减持方")
    private String S0802a;

    @TableField("变动方式")
    private String S0803a;

    @TableField("第一次公告日期")
    private String S0805a;

    @TableField("事件ID")
    private String EventID;

    @TableField("序号")
    private String Rak;

    @TableField("成功与否")
    private String S0804a;

    @TableField("过户登记日期")
    private String S0806a;

    @TableField("本次变动数量")
    private String S0807a;

    @TableField("本次变动数量占总股本的比例（百分比）")
    private String S0808a;

    @TableField("变动前股份性质")
    private String S0809a;

    @TableField("变动后股份性质")
    private String S0810a;

    @TableField("支付方式")
    private String S0811a;

    @TableField("交易总额")
    private String S0812a;

    @TableField("其中：现金")
    private String S0813a;

    @TableField("其中：有价证券")
    private String S0814a;

    @TableField("其中：资产")
    private String S0815a;

    @TableField("是否影响公司控制权的变化")
    private String S0816a;

}
