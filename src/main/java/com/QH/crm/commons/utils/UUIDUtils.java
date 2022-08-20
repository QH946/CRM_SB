package com.QH.crm.commons.utils;

import java.util.UUID;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.commons.utils
 * @date 2022/8/9 10:53
 */
public class UUIDUtils {
    /**
     * 获取uuid的值
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
