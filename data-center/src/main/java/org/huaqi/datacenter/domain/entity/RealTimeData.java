package org.huaqi.datacenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author whm
 * @date 2024/3/19 23:13
 */
@Data
@TableName("实时价量数据")
public class RealTimeData {
    @TableField("代码")
    private String stkCd;

    @TableField("名称")
    private String name;

    @TableField("最新价")
    private String latestPrice;

    @TableField("涨跌幅")
    private String changeRate;

    @TableField("涨跌额")
    private String changeAmount;

    @TableField("成交量")
    private String volume;

    @TableField("成交额")
    private String turnover;

    @TableField("振幅")
    private String amplitude;

    @TableField("最高")
    private String max;

    @TableField("最低")
    private String min;

    @TableField("今开")
    private String open;

    @TableField("昨收")
    private String preClose;

    @TableField("量比")
    private String volumeRatio;

    @TableField("换手率")
    private String turnoverRate;

    @TableField("市盈率动态")
    private String peRatio;

    @TableField("市净率")
    private String pbRatio;

    @TableField("总市值")
    private String totalMarketValue;

    @TableField("流通市值")
    private String circulationMarketValue;

    @TableField("涨速")
    private String riseSpeed;

    @TableField("5分钟涨跌")
    private String fiveMinuteChange;

    @TableField("60日涨跌幅")
    private String sixtyDayChangeRate;

    @TableField("年初至今涨跌幅")
    private String yearChangeRate;
}
