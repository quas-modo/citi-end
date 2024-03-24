package org.huaqi.chatcenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author whm
 * @date 2024/1/24 9:55
 */
@Document("history")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class History {
    @Id
    private Long historyId;

    private Long userId;

    private String userName;

    private String historyTitle;

    private String time;

    private List<Dialogue> dialogueList;
}
