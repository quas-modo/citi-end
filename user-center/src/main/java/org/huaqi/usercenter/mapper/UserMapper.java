package org.huaqi.usercenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.huaqi.usercenter.domain.entity.User;

/**
 * @author whm
 * @date 2024/1/20 16:01
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
