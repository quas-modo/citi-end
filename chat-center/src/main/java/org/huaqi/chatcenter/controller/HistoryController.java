package org.huaqi.chatcenter.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.huaqi.chatcenter.domain.entity.History;
import org.huaqi.chatcenter.domain.vo.DialogueVO;
import org.huaqi.chatcenter.domain.vo.HistoryVO;
import org.huaqi.chatcenter.domain.vo.Response;
import org.huaqi.chatcenter.service.HistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author whm
 * @date 2024/1/24 15:37
 */
@Tag(name = "大模型聊天记录管理")
@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/chat")
public class HistoryController {
    private final HistoryService historyService;

    @Operation(summary = "根据用户id查找聊天记录")
    @GetMapping("/findAllByUserId")
    public Response<List<History>> findAllByUserId(@RequestParam("userId") Long userId) {
        List<History> histories = historyService.findAllByUserId(userId);
        if (histories == null) {
            histories = new ArrayList<>();
        }
        return Response.success(200, "获取聊天记录成功", histories);
    }

    @Operation(summary = "删除指定的聊天")
    @GetMapping("/deleteById")
    public Response<?> deleteById(@RequestParam("id") Long id) {
        historyService.deleteById(id);
        return Response.success(200, "删除聊天记录成功");
    }

    @Operation(summary = "删除所有聊天历史")
    @PostMapping("/deleteAll")
    public Response<?> deleteAll(@RequestParam("id") Long userId){
        historyService.deleteByUserId(userId);
        return Response.success(200, "删除历史记录成功");
    }

    @Operation(summary = "新增聊天")
    @PostMapping("/createHistory")
    public Response<History> create(@RequestBody HistoryVO historyVO) {
        History history = historyService.createHistory(historyVO);
        return Response.success(200, "新增聊天成功", history);
    }



    @Operation(summary = "增加对话")
    @PostMapping("/addDialogue")
    public Response<History> addDialogue(@RequestBody DialogueVO dialogueVO) {
        History history = historyService.addDialogue(dialogueVO);
        if (history == null) {
            return Response.failed(999, "聊天不存在");
        }
        return Response.success(200, "增加对话成功", history);
    }

    @Operation(summary = "更新对话")
    @PostMapping("/regenerate")
    public Response<History> regenerate(@RequestBody DialogueVO dialogueVO) {
        History history = historyService.regenerate(dialogueVO);
        if (history == null) {
            return Response.failed(999, "聊天不存在！");
        }
        return Response.success(200, "重新生成对话成功", history);
    }

    @Operation(summary = "查询历史")
    @GetMapping("/query")
    public Response<List<History>> query(@RequestParam("userId") Long userId, @RequestParam("keywords") String keywords) {
        List<History> histories = historyService.findAllByUserId(userId);
        if (histories == null) {
            histories = new ArrayList<>();
        }
        List<History> queryHistories = new ArrayList<>();
        for (History history: histories) {
            if (history.getHistoryTitle().contains(keywords)) {
                queryHistories.add(history);
            }
        }
        return Response.success(200, "查询相关对话成功", queryHistories);
    }

    @Operation(summary = "更改历史标题")
    @PostMapping("/updateTitle")
    public Response<History> updateTitle(@RequestParam("historyId") Long historyId, @RequestParam("newTitle") String newTitle) {
        History history = historyService.updateTitle(historyId, newTitle);
        if (history == null) {
            return Response.failed(999, "历史记录不存在！");
        }
        return Response.success(200, "成功更新历史标题", history);
    }
}
