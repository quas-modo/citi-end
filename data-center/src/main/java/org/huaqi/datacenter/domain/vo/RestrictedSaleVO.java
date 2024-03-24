package org.huaqi.datacenter.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whm
 * @date 2024/3/2 17:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestrictedSaleVO {
    private String shareholderName;

    private String circulationDate;

    private String circulationShares;

    private String listedDate;

    private String listedShares;

    private String lockShares;

    private String proportion;

    private String listedSharesType;
}
