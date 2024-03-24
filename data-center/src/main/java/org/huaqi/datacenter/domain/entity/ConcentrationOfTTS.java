package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/2/22 14:53
 */
@Data
@TableName("十大股东股权集中度")
public class ConcentrationOfTTS {
    @TableField("证券代码")
    private String stkCd;

    @TableField("统计截止日期")
    private String reptDt;

    @TableField("股权集中指标1(百分比)")
    private String shrcr1;

    @TableField("股权集中指标2(百分比)")
    private String shrcr2;

    @TableField("股权集中指标3(百分比)")
    private String shrcr3;

    @TableField("股权集中指标4(百分比)")
    private String shrcr4;

    @TableField("Z指数")
    private String shrx;

    @TableField("S指数(百分比)")
    private String shrs;

    @TableField("H指数")
    private String shrhfd;

    @TableField("Herfindahl_3指数")
    private String shrhfd3;

    @TableField("Herfindahl_5指数")
    private String shrhfd5;

    @TableField("Herfindahl_10指数")
    private String shrhfd10;
}
