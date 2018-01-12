package org.smart4j.chapter2.Utils;

/**转型操作类工具
 * Created by yaphetsBin on 2018-01-11.
 */
public class CastUtil {

    /**
     * 转为String类型
     * @param obj
     * @return
     */
    public static  String castString(Object obj){
        return CastUtil.castString(obj,"");
    }

    private static String castString(Object obj, String defaultValue) {
        return obj!=null?String.valueOf(obj):defaultValue;
    }
}
