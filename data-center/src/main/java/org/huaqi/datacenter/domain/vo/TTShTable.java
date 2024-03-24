package org.huaqi.datacenter.domain.vo;

import lombok.Data;

import java.util.List;

/**
 * @author whm
 * @date 2024/3/1 12:30
 */
@Data
public class TTShTable {
    private String title;

    private List<TTShVO> data;
}
