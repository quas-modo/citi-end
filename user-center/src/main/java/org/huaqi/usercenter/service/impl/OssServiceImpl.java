package org.huaqi.usercenter.service.impl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import lombok.extern.slf4j.Slf4j;
import org.huaqi.usercenter.service.OssService;
import org.huaqi.usercenter.utils.OssUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * @author whm
 * @date 2024/1/20 16:30
 */
@Slf4j
@Service
public class OssServiceImpl implements OssService {
    @Override
    public String uploadFile(MultipartFile file) {
        String url = null;
        String endpoint = OssUtil.endpoint;
        String accessKeyId = OssUtil.accessKeyId;
        String accessKeySecret = OssUtil.accessKeySecret;
        String bucketName = OssUtil.bucketName;
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        try {
            InputStream inputStream = file.getInputStream();
            //获取上传的文件的名字
            String filename = file.getOriginalFilename();
            //随机uuid是为了拼接文件名，防止用户上传两个名字相同的文件后覆盖掉前一个
            UUID uuid = UUID.randomUUID();
            //这里是为了按上传时间分配目录。精确到日
            String s = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            //拼接成完整的文件名。
            filename = s + uuid + filename;
            //传入三个参数
            ossClient.putObject(bucketName, filename, inputStream);
            //拼接url
            url = "https://" + bucketName + "." + endpoint.substring(8) + "/" + filename;
        } catch (IOException e) {
            log.error("上传文件失败: ", e);
        } finally {
            ossClient.shutdown();
        }
        return url;
    }
}
