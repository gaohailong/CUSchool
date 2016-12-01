package com.sxau.cyschool.interceptor;

import com.opensymphony.xwork2.conversion.TypeConversionException;
import org.apache.struts2.components.Date;
import org.apache.struts2.util.StrutsTypeConverter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * Created by gaohailong on 2016/12/1.
 */
public class DateConverter extends StrutsTypeConverter {
    //支持转换的多种日期格式，可增加时间格式
    private final DateFormat[] dfs = {
            new SimpleDateFormat("yyyy年MM月dd日"),
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("MM/dd/yy"),
            new SimpleDateFormat("yyyy.MM.dd"),
            new SimpleDateFormat("yy.MM.dd"),
            new SimpleDateFormat("yyyy/MM/dd")
    };

    public Object convertFromString(Map map, String[] strings, Class aClass) {
        String dateStr = strings[0];
        for (int i = 0; i < dfs.length; i++) {   //遍历日期支持格式，进行转换
            try {
                return dfs[i].parse(dateStr);
            } catch (Exception e) {
                continue;
            }
        }
        //如果遍历完毕后仍没有转换成功，表示出现转换异常
        throw new TypeConversionException();
    }

    public String convertToString(Map map, Object o) {
        Date date = (Date) o;
        //输出格式是yyyy-MM-dd
        return new SimpleDateFormat("yyyy.MM.dd").format(date);
    }
}
