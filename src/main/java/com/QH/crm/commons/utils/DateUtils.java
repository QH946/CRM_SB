package com.QH.crm.commons.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.commons.utils
 * @date 2022/8/7 11:49
 */
//对Date类型数据处理的工具类
public class DateUtils {
    //对指定的date对象进行格式化 yyyy-MM-dd HH:mm:ss
    public static String formatDateTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        return dateStr;
    }
    //对指定的date对象进行格式化 yyyy-MM-dd
    public static String formatDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(date);
        return dateStr;
    }
    //对指定的date对象进行格式化 HH:mm:ss
    public static String formatTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String dateStr = sdf.format(date);
        return dateStr;
    }
}
