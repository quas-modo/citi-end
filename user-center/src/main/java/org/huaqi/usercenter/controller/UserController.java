package org.huaqi.usercenter.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.huaqi.usercenter.domain.vo.Response;
import org.huaqi.usercenter.domain.vo.UserInfo;
import org.huaqi.usercenter.domain.vo.UserVO;
import org.huaqi.usercenter.service.OssService;
import org.huaqi.usercenter.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author whm
 * @date 2024/1/21 10:50
 */
@Tag(name = "用户管理")
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    private final UserService userService;

    private final OssService ossService;

    @Operation(summary = "登录")
    @GetMapping("/login")
    public Response<?> login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        Long id = userService.login(userName, password);
        if (id != null) {
            StpUtil.login(id);
            SaTokenInfo saTokenInfo = StpUtil.getTokenInfo();
            return Response.success(200, "登录成功！", saTokenInfo);
        } else {
            return Response.failed(999, "用户名或密码错误！");
        }
    }

    @Operation(summary = "退出登录")
    @GetMapping("/logout")
    public Response<?> logout() {
        StpUtil.logout();
        return Response.success(200, "退出成功！");
    }

    @Operation(summary = "注册")
    @PostMapping("/register")
    public Response<?> register(@RequestBody UserVO userVO) {
        String res = userService.register(userVO);
        if (res.equals("注册成功")) {
            return Response.success(200, "注册成功！");
        } else {
            return Response.failed(999, res);
        }
    }

    /**
     * 修改密码
     */
    @Operation(summary = "修改密码")
    @PostMapping("/editPwd")
    public Response<?> update(@RequestBody UserVO userVO) {
        String res = userService.update(userVO);
        if (res.equals("修改密码成功")) {
            return Response.success(200, "修改密码成功！");
        } else {
            return Response.failed(999, res);
        }
    }

    /**
     * 获取用户头像
     */
    @Operation(summary = "获取用户名和头像")
    @GetMapping("/getUserInfo")
    public Response<?> getUserInfo() {
        if (StpUtil.isLogin()) {
            Long userId = StpUtil.getLoginIdAsLong();
            UserInfo userInfo = userService.getUserInfo(userId);
            return Response.success(200, "获取用户头像成功！", userInfo);
        } else {
            return Response.failed(999, "用户未登录！");
        }
    }

    /**
     * 修改用户头像
     */
    @Operation(summary = "修改用户头像")
    @PostMapping("/editAvatar")
    public Response<?> editAvatar(@RequestParam("newPhoto") MultipartFile file) {
        if (StpUtil.isLogin()) {
            Long userId = StpUtil.getLoginIdAsLong();
            String url = ossService.uploadFile(file);
            String res = userService.editUserAvatar(userId, url);
            if (res.equals("用户不存在")) {
                return Response.failed(999, res);
            } else {
                return Response.success(200, res, url);
            }
        } else {
            return Response.failed(999, "用户未登录！");
        }
    }

    /**
     * 手机验证码登录
     */
    @Operation(summary = "手机验证码登录")
    @GetMapping("/loginByPhone")
    public Response<?> loginByPhone(@RequestParam("phone") String phone, @RequestParam("verifyCode") String verifyCode) {
        String res = userService.loginByPhone(phone, verifyCode);
        if (res.equals("验证码错误") || res.equals("该手机号未绑定用户")) {
            return Response.failed(999, res);
        } else {
            StpUtil.login(Long.parseLong(res));
            SaTokenInfo info = StpUtil.getTokenInfo();
            return Response.success(200, "登录成功！", info);
        }
    }
}
