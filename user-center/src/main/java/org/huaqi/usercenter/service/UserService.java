package org.huaqi.usercenter.service;

import org.huaqi.usercenter.domain.vo.UserInfo;
import org.huaqi.usercenter.domain.vo.UserVO;

/**
 * @author whm
 * @date 2024/1/20 16:07
 */
public interface UserService {
    Long login(String userName, String password);

    String register(UserVO userVO);

    String update(UserVO userVO);

    UserInfo getUserInfo(Long userId);

    String editUserAvatar(Long userId, String url);

    String loginByPhone(String phone, String verifyCode);
}
