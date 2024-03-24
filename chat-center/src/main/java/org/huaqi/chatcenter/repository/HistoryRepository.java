package org.huaqi.chatcenter.repository;

import org.huaqi.chatcenter.domain.entity.History;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author whm
 * @date 2024/1/24 10:04
 */
public interface HistoryRepository extends MongoRepository<History, Long> {
    List<History> findAllByUserId(Long userId);

    History findFirstByOrderByHistoryIdDesc();


}
