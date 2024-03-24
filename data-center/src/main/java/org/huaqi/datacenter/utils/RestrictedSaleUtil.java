package org.huaqi.datacenter.utils;

import java.util.HashMap;

/**
 * @author whm
 * @date 2024/3/2 17:43
 */
public class RestrictedSaleUtil {
    /**
     * 1=IPO;2=普通股公开增发;3=普通股非公开增发;4=配股;5=首发原股东;6=股权分置改革
     */
    public static HashMap<String, String> listedSharesTypeMap = new HashMap<>() {
        {
            put("1", "IPO");
            put("2", "普通股公开增发");
            put("3", "普通股非公开增发");
            put("4", "配股");
            put("5", "首发原股东");
            put("6", "股权分置改革");
        }
    };

    public static String getLSType(String key) {
        return listedSharesTypeMap.get(key);
    }
}
