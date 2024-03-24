package org.huaqi.usercenter.service.impl;

import cn.dev33.satoken.secure.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.huaqi.usercenter.domain.entity.User;
import org.huaqi.usercenter.domain.vo.UserInfo;
import org.huaqi.usercenter.mapper.UserMapper;
import org.huaqi.usercenter.service.UserService;
import org.huaqi.usercenter.utils.RedisCache;
import org.springframework.stereotype.Service;
import org.huaqi.usercenter.domain.vo.UserVO;
import java.util.Date;

/**
 * @author whm
 * @date 2024/1/20 16:20
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    private final RedisCache redisCache;

    @Override
    public Long login(String userName, String password) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserName, userName);
        User user = userMapper.selectOne(queryWrapper);
        if (user == null || !BCrypt.checkpw(password, user.getPassword())) {
            return null;
        }
        user.setLastLoginTime(new Date());
        userMapper.updateById(user);
        return user.getUserId();
    }

    @Override
    public String register(UserVO userVO) {
        String captcha = redisCache.getCacheObject(userVO.getPhone());
        if (!userVO.getVerifyCode().equals(captcha)) {
            return "验证码错误";
        }
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserName, userVO.getUserName());
        User user = userMapper.selectOne(queryWrapper);
        if (user != null) {
            return "用户名已存在";
        }

        queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getPhone, userVO.getPhone());
        user = userMapper.selectOne(queryWrapper);
        if (user != null) {
            return "该手机号已绑定用户";
        }

        user = new User();
        user.setUserName(userVO.getUserName());
        user.setPassword(BCrypt.hashpw(userVO.getPassword()));
        user.setPhone(userVO.getPhone());
        user.setCreateTime(new Date());
        user.setAvatar("https://kiyotakawang.oss-cn-hangzhou.aliyuncs.com/img/用户头像.png");
        userMapper.insert(user);

        redisCache.deleteObject(userVO.getPhone());
        return "注册成功";
    }

    @Override
    public String update(UserVO userVO) {
        String captcha = redisCache.getCacheObject(userVO.getPhone());
        if (!userVO.getVerifyCode().equals(captcha)) {
            return "验证码错误";
        }
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getPhone, userVO.getPhone());
        User user = userMapper.selectOne(queryWrapper);
        if (user == null) {
            return "该手机号未绑定用户";
        }
        user.setPassword(BCrypt.hashpw(userVO.getPassword()));
        userMapper.updateById(user);
        redisCache.deleteObject(userVO.getPhone());
        return "修改密码成功";
    }

    @Override
    public UserInfo getUserInfo(Long userId) {
        User user = userMapper.selectById(userId);
        return new UserInfo(user.getUserName(), user.getAvatar());
    }

    @Override
    public String editUserAvatar(Long userId, String url) {
        User user = userMapper.selectById(userId);
        if (user == null) {
            return "用户不存在";
        }
        user.setAvatar(url);
        userMapper.updateById(user);
        return "修改用户头像成功";
    }

    @Override
    public String loginByPhone(String phone, String verifyCode) {
        String code = redisCache.getCacheObject(phone);
        if (!verifyCode.equals(code)) {
            return "验证码错误";
        }
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getPhone, phone);
        User user = userMapper.selectOne(queryWrapper);
        if (user == null) {
            return "该手机号未绑定用户";
        }
        user.setLastLoginTime(new Date());
        userMapper.updateById(user);
        redisCache.deleteObject(phone);
        return Long.toString(user.getUserId());
    }
}
