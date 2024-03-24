package org.huaqi.datacenter.utils;


import java.util.HashMap;

/**
 * @author whm
 * @date 2024/3/1 22:37
 */
public class CapitalChangeUtil {
    /**
     * 1=无偿转让，2=协议转让，3=抵债，4=合并重组，5=股权出资，6=拍卖，7=间接变更，8=委托管理或授权经营，9=其它，10=二级市场股份增减持，
     * 11=股改支付对价，12=司法划转（司法裁定）；13=做市转让；14=竞价转让；15=取得挂牌公司定向发行的新股；16=询价转让
     */
    public static HashMap<String, String> changeTypeMap = new HashMap<>() {
        {
            put("1", "无偿转让");
            put("2", "协议转让");
            put("3", "抵债");
            put("4", "合并重组");
            put("5", "股权出资");
            put("6", "拍卖");
            put("7", "间接变更");
            put("8", "委托管理或授权经营");
            put("9", "其它");
            put("10", "二级市场股份增减持");
            put("11", "股改支付对价");
            put("12", "司法划转（司法裁定）");
            put("13", "做市转让");
            put("14", "竞价转让");
            put("15", "取得挂牌公司定向发行的新股");
            put("16", "询价转让");
        }
    };

    /**
     * 成功与否
     * 1=成功，2=未成功，3=未完成
     */
    public static HashMap<String, String> changeStatusMap = new HashMap<>() {
        {
            put("1", "成功");
            put("2", "未成功");
            put("3", "未完成");
        }
    };

    /**
     * 是否影响公司控制权变化
     * 1=无变化，2=变化，0＝未完成
     */
    public static HashMap<String, String> controlChangeMap = new HashMap<>() {
        {
            put("1", "无变化");
            put("2", "变化");
            put("0", "未完成");
        }
    };

    public static String getChangeType(String code) {
        return changeTypeMap.get(code);
    }

    public static String getChangeStatus(String code) {
        return changeStatusMap.get(code);
    }

    public static String getControlChange(String code) {
        return controlChangeMap.get(code);
    }
}
