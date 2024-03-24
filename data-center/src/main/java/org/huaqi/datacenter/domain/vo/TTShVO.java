package org.huaqi.datacenter.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whm
 * @date 2024/3/1 11:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TTShVO {
    private String stkCd;

    private String reptDt;

    private String S0301a;

    private String S0306a;

    private String S0302a;

    private String S0303a;

    private String S0304a;

    private String S0305a;

    private String changeType;

    private String changeNum;

    private String changePercentage;

    private String shareholderNature;

    private String category;
}
