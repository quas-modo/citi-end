package org.huaqi.chatcenter.service;

import org.huaqi.chatcenter.domain.entity.History;
import org.huaqi.chatcenter.domain.vo.DialogueVO;
import org.huaqi.chatcenter.domain.vo.HistoryVO;

import java.util.List;

/**
 * @author whm
 * @date 2024/1/24 10:08
 */
public interface HistoryService {
    List<History> findAllByUserId(Long userId);

    History createHistory(HistoryVO historyVO);

    void deleteAll();

    History addDialogue(DialogueVO dialogueVO);

    void deleteById(Long id);

    History regenerate(DialogueVO dialogueVO);

    History updateTitle(Long historyId, String newTitle);

    void deleteByUserId(Long userId);
}
