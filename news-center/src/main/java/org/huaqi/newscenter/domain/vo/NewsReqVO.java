package org.huaqi.newscenter.domain.vo;

import lombok.Data;

import java.util.Date;

@Data
public class NewsReqVO {
    private String title;
    private String source;
    private String date;
    private String content;
    private Boolean isTreasured; // 是否是精选新闻
}
