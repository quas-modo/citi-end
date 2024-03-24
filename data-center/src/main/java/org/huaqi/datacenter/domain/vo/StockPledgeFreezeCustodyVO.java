package org.huaqi.datacenter.domain.vo;

import lombok.Data;

/**
 * @author whm
 * @date 2024/3/1 22:09
 */
@Data
public class StockPledgeFreezeCustodyVO {
    private String stkCd;

    private String reptDt;

    private String S0301a;

    private String S0302b;

    private Status status;

    // 占总股本比例
    private Double rate;
}
