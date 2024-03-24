package org.huaqi.newscenter.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 新闻的实体类
 */
@Data
@TableName("news")
@NoArgsConstructor
public class News {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("title")
    private String title;

    @TableField("source")
    private String source;

    @TableField("pub_date")
    private String date;

    @TableField("content")
    private String content;

    @TableField("treasured")
    private Boolean isTreasured; // 是否是精选新闻

    public News(String title, String source, String date, String content, Boolean isTreasured) {
        this.title = title;
        this.source = source;
        this.date = date;
        this.content = content;
        this.isTreasured = isTreasured;
    }
}
