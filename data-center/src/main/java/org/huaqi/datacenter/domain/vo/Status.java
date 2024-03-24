package org.huaqi.datacenter.domain.vo;

/**
 * @author whm
 * @date 2024/3/1 22:13
 */
public enum Status {
    Pledge("1", "质押"),
    Freeze("2", "冻结"),
    Custody("3", "托管");

    Status(String code, String desc) {
    }
}
