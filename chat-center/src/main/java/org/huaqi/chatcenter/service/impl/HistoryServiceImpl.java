package org.huaqi.chatcenter.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.huaqi.chatcenter.domain.entity.Dialogue;
import org.huaqi.chatcenter.domain.entity.History;
import org.huaqi.chatcenter.domain.vo.DialogueVO;
import org.huaqi.chatcenter.domain.vo.HistoryVO;
import org.huaqi.chatcenter.repository.HistoryRepository;
import org.huaqi.chatcenter.service.HistoryService;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author whm
 * @date 2024/1/24 10:09
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {
    private final HistoryRepository historyRepository;

    static final Long defaultHistoryId = 0L;

    static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public List<History> findAllByUserId(Long userId) {
        List<History> histories = historyRepository.findAllByUserId(userId);
        histories = histories.stream().sorted(Comparator.comparing(History::getTime).reversed()).toList();
        return histories;
    }

    @Override
    public History createHistory(HistoryVO historyVO) {
        List<Dialogue> dialogueList = new ArrayList<>();
//        dialogueList.add(new Dialogue(0, historyVO.getFirstQuestion(), df.format(new Date()), true));
//        dialogueList.add(new Dialogue(1, historyVO.getFirstAnswer(), df.format(new Date()), false));
        History history = new History(getLastHistoryId() + 1, historyVO.getUserId(), historyVO.getUserName(),
                historyVO.getHistoryTitle(), df.format(new Date()), dialogueList);
        return historyRepository.save(history);
    }

    @Override
    public void deleteAll() {
        historyRepository.deleteAll();
    }

    @Override
    public void deleteByUserId(Long userId){
        List<History> histories = historyRepository.findAllByUserId(userId);
        for (History history: histories) {
            historyRepository.deleteById(history.getHistoryId());
        }
    }

    @Override
    public History addDialogue(DialogueVO dialogueVO) {
        History history = historyRepository.findById(dialogueVO.getHistoryId()).orElse(null);
        if (history == null) {
            log.warn("历史记录" + dialogueVO.getHistoryId() + "不存在！");
            return null;
        }
        Dialogue dialogue = new Dialogue(history.getDialogueList().size(), dialogueVO.getContent(),
                df.format(new Date()), dialogueVO.getIsUser());
        history.getDialogueList().add(dialogue);

        return historyRepository.save(history);
    }

    @Override
    public void deleteById(Long id) {
        historyRepository.deleteById(id);
    }

    private Long getLastHistoryId() {
        History history = historyRepository.findFirstByOrderByHistoryIdDesc();
        if (history != null) {
            return history.getHistoryId();
        }
        return defaultHistoryId;
    }

    @Override
    public History regenerate(DialogueVO dialogueVO){
        History history = historyRepository.findById(dialogueVO.getHistoryId()).orElse(null);
        if (history == null) {
            log.warn("历史记录" + dialogueVO.getHistoryId() + "不存在！");
            return null;
        }
        List<Dialogue> dialogues = history.getDialogueList();
        int size = dialogues.size();
        Dialogue reDialogue = new Dialogue(size, dialogueVO.getContent(),
                df.format(new Date()), dialogueVO.getIsUser());
        for (int i = size - 1; i > 0; i--) {
            if (!dialogues.get(i).getIsUser()){
                dialogues.set(i, reDialogue);
                break;
            }
        }

        return historyRepository.save(history);
    }

    @Override
    public History updateTitle(Long historyId, String newTitle) {
        History history = historyRepository.findById(historyId).orElse(null);
        if (history == null) {
            log.warn("历史记录" + historyId + "不存在！");
            return null;
        }
        history.setHistoryTitle(newTitle);
        return historyRepository.save(history);
    }
}
