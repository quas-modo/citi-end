package org.huaqi.usercenter.utils;

import jakarta.annotation.Resource;
import org.huaqi.usercenter.domain.entity.AliConfig;
import org.huaqi.usercenter.mapper.AliMapper;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author whm
 * @date 2024/1/20 16:30
 */
@Component
public class OssUtil implements InitializingBean {
    @Resource
    private AliMapper aliMapper;

    public static String endpoint;

    public static String accessKeyId;

    public static String accessKeySecret;

    public static String bucketName;

    @Override
    public void afterPropertiesSet() throws Exception {
        endpoint = "https://oss-cn-hangzhou.aliyuncs.com";

        AliConfig config = aliMapper.selectById(1);
        accessKeyId = config.getAccessKey();
        accessKeySecret = config.getAccessSecret();;

        bucketName = "kiyotakawang";
    }
}
