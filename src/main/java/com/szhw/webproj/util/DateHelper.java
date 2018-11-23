package com.szhw.webproj.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author HJF
 * @date 2018/11/12 18:35
 */
public class DateHelper {
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;
    public static String currentDate(){
        return FORMATTER.format(LocalDate.now());
    }

    public static void main(String[] args) {
        System.out.println(DateHelper.currentDate());
    }
}
