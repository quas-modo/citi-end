package org.huaqi.usercenter.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author whm
 * @date 2024/1/20 16:29
 */
public interface OssService {
    String uploadFile(MultipartFile file);
}
