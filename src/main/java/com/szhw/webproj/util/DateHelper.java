package com.szhw.webproj.util;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author HJF
 * @date 2018/11/12 18:35
 */
public class DateHelper {
    private static DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
    public static String currentDate(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(new Date());
    }
}
