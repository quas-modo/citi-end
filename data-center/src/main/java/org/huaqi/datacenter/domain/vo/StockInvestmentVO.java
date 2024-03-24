package org.huaqi.datacenter.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whm
 * @date 2024/3/19 22:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockInvestmentVO {
    private String stkCd;

    private String endDate;

    private String holdInstitutionName;

    private String endDateRatio;

    private String industry;

    private String investCompany;
}
