package org.huaqi.datacenter.utils;

import java.util.HashMap;

/**
 * @author whm
 * @date 2024/3/2 20:05
 */
public class RelatedTransactionUtil {
    /**
     * 交易方向
     * 1=上市公司处于卖方立场，2=上市公司处于买方立场，3=上市公司处于无法分辨。
     */
    public static HashMap<String, String> directionMap = new HashMap<String, String>() {
        {
            put("1", "上市公司处于卖方立场");
            put("2", "上市公司处于买方立场");
            put("3", "上市公司处于无法分辨");
        }
    };

    /**
     * 交易性质
     * 1=与上市公司的关联交易:该交易为本公司与关联方之间的交易
     * 2=关联公司之间的交易; 该交易为关联方与关联方之间的交易
     */
    public static HashMap<String, String> trasubMap = new HashMap<String, String>() {
        {
            put("1", "与上市公司的关联交易");
            put("2", "关联公司之间的交易");
        }
    };

    /**
     * 关联交易事项分类
     * 01=商品交易类02=资产交易类03=提供或接受劳务04=代理，委托05=资金交易06=担保，抵押07=租赁08=托管经营（管理方面）09=赠与
     * 10=非货币交易13=股权交易15=债权债务类交易17=合作项目18=许可协议19=研究与开发成果20=关键管理人员报酬 21=其他事项
     */
    public static HashMap<String, String> repatMap = new HashMap<String, String>() {
        {
            put("01", "商品交易类");
            put("02", "资产交易类");
            put("03", "提供或接受劳务");
            put("04", "代理，委托");
            put("05", "资金交易");
            put("06", "担保，抵押");
            put("07", "租赁");
            put("08", "托管经营（管理方面）");
            put("09", "赠与");
            put("10", "非货币交易");
            put("13", "股权交易");
            put("15", "债权债务类交易");
            put("17", "合作项目");
            put("18", "许可协议");
            put("19", "研究与开发成果");
            put("20", "关键管理人员报酬");
            put("21", "其他事项");
        }
    };

    /**
     * 货币类型
     * 关联公司货币形式.默认为人民币
     * CNY=人民币，USD=美元，HKD=港币，GBP=英镑，JPY=日元，EUR=欧元，DEM=德国马克，AUD=澳元，SGD=新加坡元，CAD=加拿大元，ARP=比索，
     * THB=泰铢，KRW =韩元，SEK=瑞典克朗，MYR=马币，INR=印度卢比，PKR=巴基斯坦卢比，ZAR=南非兰特，VND=越南盾，PLZ=波兰兹罗提，
     * SUR=俄罗斯卢布，HUF=匈牙利福林，JOD=约旦第纳尔，Dirhams=迪拉姆，PHP=菲律宾比索，BRC=巴西币，MOP =澳门元，CSK=捷克克朗，
     * IDR=印尼盾，MYR=林吉特,SOM=索姆，KTZ=坚戈,SRG=苏里南盾，CYP=塞浦路斯镑，NLG=荷兰盾，QAR=卡塔尔里亚尔，KINA=巴布亚新几内亚基那，
     * BEF=比利时法郎，DKK=丹麦克朗，NGN=尼日利亚，POL=波兰，NTD=中国台湾
     */
    public static HashMap<String, String> curTypeMap = new HashMap<String, String>() {
        {
            put("CNY", "人民币");
            put("USD", "美元");
            put("HKD", "港币");
            put("GBP", "英镑");
            put("JPY", "日元");
            put("EUR", "欧元");
            put("DEM", "德国马克");
            put("AUD", "澳元");
            put("SGD", "新加坡元");
            put("CAD", "加拿大元");
            put("ARP", "比索");
            put("THB", "泰铢");
            put("KRW", "韩元");
            put("SEK", "瑞典克朗");
            put("MYR", "马币");
            put("INR", "印度卢比");
            put("PKR", "巴基斯坦卢比");
            put("ZAR", "南非兰特");
            put("VND", "越南盾");
            put("PLZ", "波兰兹罗提");
            put("SUR", "俄罗斯卢布");
            put("HUF", "匈牙利福林");
            put("JOD", "约旦第纳尔");
            put("Dirhams", "迪拉姆");
            put("PHP", "菲律宾比索");
            put("BRC", "巴西币");
            put("MOP", "澳门元");
            put("CSK", "捷克克朗");
            put("IDR", "印尼盾");
            put("MYR", "林吉特");
            put("SOM", "索姆");
            put("KTZ", "坚戈");
            put("SRG", "苏里南盾");
            put("CYP", "塞浦路斯镑");
            put("NLG", "荷兰盾");
            put("QAR", "卡塔尔里亚尔");
            put("KINA", "巴布亚新几内亚基那");
            put("BEF", "比利时法郎");
            put("DKK", "丹麦克朗");
            put("NGN", "尼日利亚");
            put("POL", "波兰");
            put("NTD", "中国台湾");
        }
    };

    /**
     * 交易定价原则
     *  01=市场价格定价,02=有附属条件的市场价格定价（包括国际市场定价）,03=协议定价,04=国家价格标准（或资费标准）
     *  定价,05=有附属条件的国家价格标准定价,06=地方政府部门规定的价格,07=银行存/贷款费率定价,08=以出厂价格为基础的定价,
     *  09=以成本为价为基础的定价,10=招标定价,11=以评估价为基础定价,12=以面值为基础定价,13=其他
     */
    public static HashMap<String, String> princplMap = new HashMap<String, String>() {
        {
            put("01", "市场价格定价");
            put("02", "有附属条件的市场价格定价（包括国际市场定价）");
            put("03", "协议定价");
            put("04", "国家价格标准（或资费标准）定价");
            put("05", "有附属条件的国家价格标准定价");
            put("06", "地方政府部门规定的价格");
            put("07", "银行存/贷款费率定价");
            put("08", "以出厂价格为基础的定价");
            put("09", "以成本为价为基础的定价");
            put("10", "招标定价");
            put("11", "以评估价为基础定价");
            put("12", "以面值为基础定价");
            put("13", "其他");
        }
    };

    public static String getTrasub(String trasub) {
        return trasubMap.get(trasub);
    }

    public static String getRepat(String repat) {
        return repatMap.get(repat);
    }

    public static String getCurType(String curType) {
        return curTypeMap.get(curType);
    }

    public static String getPrincpl(String princpl) {
        return princplMap.get(princpl);
    }

    public static String getDirection(String dir) {
        return directionMap.get(dir);
    }

}
