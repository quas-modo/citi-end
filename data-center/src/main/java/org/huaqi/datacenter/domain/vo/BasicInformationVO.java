package org.huaqi.datacenter.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whm
 * @date 2024/3/1 10:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicInformationVO {
    private String stkCd;

    private String shortName;

    private String industryName;

    private String registerAddress;

    private String officeAddress;

    private String zipCode;

    private String secretary;

    private String secretaryTel;

    private String secretaryFax;

    private String secretaryEmail;

    private String securityConsultant;

    private String sigChange;

    private String fullName;

    private String legalRepresentative;

    private String establishDate;

    private String registerCapital;

    private String website;

    private String businessScope;

    private String email;

    private String listingDate;

    private String province;

    private String city;

    private String mainBusiness;

    private String listingState;
}
