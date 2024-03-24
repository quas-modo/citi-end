package org.huaqi.chatcenter.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whm
 * @date 2024/1/24 10:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoryVO {
    private Long userId;

    private String userName;

    // 参考chatgpt，先给出了第一个问题和答案，然后会按照这个问题给出总结的title
    private String historyTitle;

    private String firstQuestion;

    private String firstAnswer;
}
