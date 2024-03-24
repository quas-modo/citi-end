package org.huaqi.datacenter.domain.vo;

import lombok.Data;

import java.util.List;

@Data
public class TTPShTable {
    private String title;

    private List<TTPShVO> data;
}
