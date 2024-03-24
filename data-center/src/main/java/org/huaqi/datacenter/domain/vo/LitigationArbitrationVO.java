package org.huaqi.datacenter.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whm
 * @date 2024/3/2 20:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LitigationArbitrationVO {
    private String stkCd;

    private String shortName;

    private String declareDate;

    private String eventContent;

    private String eventSignDate;

    private String LATypes;

    private String plaintiff;

    private String plaintiffToCo;

    private String defendant;

    private String defendantToCo;

    private String jtRespbly;

    private String jtRespblyToCo;

    private String others;

    private String othersToCo;

    private String caseReason;

    private String LAValue;

    private String LACosts;

    private String currency;

    private String trlInstus;

    private String isSameAtrbun;

    private String LAStatus;

    private String LAContent;

    private String executnStus;

    private String LACostAsuptn;

    private String enforcedAsset;

    private String eforAstOnesp;

    private String profitImpact;
}
