package org.huaqi.chatcenter.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author whm
 * @date 2024/1/24 9:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dialogue {
    private Integer id;

    private String content;

    private String time;

    private Boolean isUser;
}
