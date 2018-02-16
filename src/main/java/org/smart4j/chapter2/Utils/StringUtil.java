package org.smart4j.chapter2.Utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 */
public class StringUtil {
    /**
     * 判断字符串是否为空
     *
     */
    public static boolean isEmpty(String str){

        if (str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

}
