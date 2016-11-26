package com.sxau.cyschool.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

/**
 * Created by gaohailong on 2016/11/26.
 */
public class UTimeUtil {

    public static String timeRandom() {
        String s = UUID.randomUUID().toString();
        return s;
    }
}
