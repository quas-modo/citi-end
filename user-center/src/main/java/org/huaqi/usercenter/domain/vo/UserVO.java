package org.huaqi.usercenter.domain.vo;

import lombok.Data;

/**
 * @author whm
 * @date 2024/1/20 16:06
 */
@Data
public class UserVO {
    private String userName;

    private String password;

    private String phone;

    private String verifyCode;
}
