package org.huaqi.chatcenter.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author whm
 * @date 2024/1/24 10:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DialogueVO {
    private Long historyId;

    private String content;

    private Boolean isUser;
}
