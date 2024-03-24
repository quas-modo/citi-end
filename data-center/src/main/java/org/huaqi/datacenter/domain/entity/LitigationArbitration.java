package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("诉讼仲裁")
public class LitigationArbitration {
    @TableField("证券代码")
    private String stkCd;

    @TableField("证券简称")
    private String shortName;

    @TableField("事件ID")
    private String eventID;

    @TableField("公告类型")
    private String declareType;

    @TableField("公告日期")
    private String declareDate;

    @TableField("事件内容")
    private String eventContent;

    @TableField("事件发生日期")
    private String eventSignDate;

    @TableField("司法类型")
    private String LATypes;

    @TableField("起诉（申请）方")
    private String plaintiff;

    @TableField("起诉（申请）方与上市公司关系")
    private String plaintiffToCo;

    @TableField("应诉（被申请）方")
    private String defendant;

    @TableField("应诉（被申请）方与上市公司关系")
    private String defendantToCo;

    @TableField("承担连带责任方")
    private String jtRespbly;

    @TableField("承担连带责任方与上市公司关系")
    private String jtRespblyToCo;

    @TableField("其他方")
    private String others;

    @TableField("其他方与上市公司关系")
    private String othersToCo;

    @TableField("涉案缘由")
    private String caseReason;

    @TableField("涉案金额")
    private String LAValue;

    @TableField("诉讼仲裁费用")
    private String LACosts;

    @TableField("币种")
    private String currency;

    @TableField("审理机构")
    private String trlInstus;

    @TableField("审理机构与上市公司注册地是否同属于一个行政区划")
    private String isSameAtrbun;

    @TableField("司法进程")
    private String LAStatus;

    @TableField("裁决（调解）内容")
    private String LAContent;

    @TableField("执行状态")
    private String executnStus;

    @TableField("诉讼仲裁费用承担")
    private String LACostAsuptn;

    @TableField("被执行财产")
    private String enforcedAsset;

    @TableField("被执行财产归属")
    private String eforAstOnesp;

    @TableField("损益影响")
    private String profitImpact;
}
