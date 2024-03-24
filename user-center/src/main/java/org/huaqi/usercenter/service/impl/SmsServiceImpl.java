package org.huaqi.usercenter.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.huaqi.usercenter.domain.entity.AliConfig;
import org.huaqi.usercenter.mapper.AliMapper;
import org.huaqi.usercenter.service.SmsService;
import org.huaqi.usercenter.utils.RedisCache;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author whm
 * @date 2024/1/20 16:07
 */
@Slf4j
@Service
public class SmsServiceImpl implements SmsService {
    private final com.aliyun.dysmsapi20170525.Client client;

    private final Random random;

    private final RedisCache redisCache;

    public SmsServiceImpl(AliMapper aliMapper, RedisCache redisCache) {
        this.random = new Random();
        this.redisCache = redisCache;

        AliConfig aliConfig = aliMapper.selectById(1);
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
                .setAccessKeyId(aliConfig.getAccessKey())
                .setAccessKeySecret(aliConfig.getAccessSecret());
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        try {
            this.client = new com.aliyun.dysmsapi20170525.Client(config);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean send(String phone) {
        int code = random.nextInt(100000, 999999);

        SendSmsRequest request = new SendSmsRequest();
        request.phoneNumbers = phone;
        //TODO: 正式上线前申请一个新的签名，短信模板也要重做
        request.signName = "chatwhale";
        request.templateCode = "SMS_465370964";
        request.templateParam = JSONObject.toJSONString(new JSONObject().fluentPut("code", code));
        SendSmsResponse response;
        try {
            response = client.sendSms(request);
            if (response.body.code.equals("OK")) {
                redisCache.setCacheObject(phone, String.valueOf(code), 60 * 5L, TimeUnit.SECONDS);
                return true;
            } else {
                log.error(new Gson().toJson(response));
                return false;
            }
        } catch (Exception e) {
            log.error("发送短信失败: ", e);
            return false;
        }
    }
}
