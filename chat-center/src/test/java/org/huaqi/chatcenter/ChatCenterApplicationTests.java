package org.huaqi.chatcenter;

import org.huaqi.chatcenter.domain.entity.History;
import org.huaqi.chatcenter.domain.vo.DialogueVO;
import org.huaqi.chatcenter.domain.vo.HistoryVO;
import org.huaqi.chatcenter.service.HistoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles("dev")
class ChatCenterApplicationTests {
    @Autowired
    private HistoryService historyService;

    @Test
    void contextLoads() {
    }

    @Test
    void testHistoryService() {
        for (int i = 0; i < 10; i++) {
            historyService.createHistory(new HistoryVO(1L, "whm", "test" + i, "question" + i, "answer" + i));
        }
        List<History> list = historyService.findAllByUserId(1L);
        for (History history : list) {
            System.out.println(history);
        }
        DialogueVO dialogueVO = new DialogueVO(1L, "新增问题", true);
        historyService.addDialogue(dialogueVO);
        dialogueVO = new DialogueVO(1L, "新增回答", false);
        History history = historyService.addDialogue(dialogueVO);
        System.out.println(history);

        historyService.deleteAll();
    }

}
