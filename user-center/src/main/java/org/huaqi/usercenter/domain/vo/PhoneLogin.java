package org.huaqi.usercenter.domain.vo;

import lombok.Data;

/**
 * @author whm
 * @date 2024/1/26 18:54
 */
@Data
public class PhoneLogin {
    private String phone;

    private String verifyCode;
}
