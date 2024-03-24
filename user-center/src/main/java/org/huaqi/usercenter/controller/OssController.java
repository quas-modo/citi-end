package org.huaqi.usercenter.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.huaqi.usercenter.domain.vo.Response;
import org.huaqi.usercenter.service.OssService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author whm
 * @date 2024/1/20 16:47
 */
@Tag(name = "图片管理")
@RestController
@RequestMapping("/oss")
@RequiredArgsConstructor
@CrossOrigin
public class OssController {
    private final OssService ossService;

    @Operation(summary = "上传图片")
    @PostMapping("/upload")
    public Response<String> upload(@RequestParam("file") MultipartFile file){
        String url = ossService.uploadFile(file);
        if (url == null){
            return Response.failed(999, "上传失败");
        } else {
            return Response.success(200, "上传成功", url);
        }
    }
}
