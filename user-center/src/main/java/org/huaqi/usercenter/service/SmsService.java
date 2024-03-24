package org.huaqi.usercenter.service;

/**
 * @author whm
 * @date 2024/1/20 16:07
 */
public interface SmsService {
    boolean send(String phone) throws Exception;
}
