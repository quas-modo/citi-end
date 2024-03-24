package org.huaqi.datacenter.domain.vo;

import lombok.Data;

/**
 * @author whm
 * @date 2024/3/1
 */
@Data
public class NumOfShVO {
    private String stkCd;

    private String reptDt;

    private String S0101; // 股东总数

    private String changeRate;
}
