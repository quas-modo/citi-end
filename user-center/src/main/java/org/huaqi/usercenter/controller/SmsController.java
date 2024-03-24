package org.huaqi.usercenter.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.huaqi.usercenter.domain.vo.Response;
import org.huaqi.usercenter.service.SmsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author whm
 * @date 2024/1/21 11:08
 */
@Tag(name = "短信管理")
@RestController
@RequestMapping("/sms")
@RequiredArgsConstructor
@CrossOrigin
public class SmsController {
    private final SmsService smsService;

    @Operation(summary = "发送短信验证码")
    @GetMapping("/send")
    public Response<?> send(String phone) throws Exception {
        boolean flag = smsService.send(phone);
        if (flag) {
            return Response.success(200, "发送成功！");
        } else {
            return Response.failed(999, "发送失败！");
        }
    }
}
