package org.huaqi.datacenter.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whm
 * @date 2024/3/2 20:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RelatedTransactionVO {
    private String stkCd;

    private String reptDt;

    private String repart;

    private String relation;

    private String isam;

    private String curType;

    private String trasub;

    private String direction;

    private String repat;

    private String kind;

    private String content;

    private String principl;

    private String notes;

}
