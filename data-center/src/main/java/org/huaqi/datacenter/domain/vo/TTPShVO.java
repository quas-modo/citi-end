package org.huaqi.datacenter.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TTPShVO {
    private String stkCd;

    private String reptDt;

    private String S0401a;

    private String S0404a;

    private String S0402a;

    private String S0403a;

    private String shareholdingRatio;

    private String sharesTradSharesRatio;

    private String sharesTradASharesRatio;

    private String changeType;

    private String changeNum;

    private String changeNumPercentage;
}
