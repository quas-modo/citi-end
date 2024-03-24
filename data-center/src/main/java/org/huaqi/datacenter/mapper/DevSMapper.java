package org.huaqi.datacenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.huaqi.datacenter.domain.entity.DevelopmentCapacity;

/**
 * @author whm
 * @date 2024/2/29 21:55
 */
@Mapper
public interface DevSMapper extends BaseMapper<DevelopmentCapacity> {
}
