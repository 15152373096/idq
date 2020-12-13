package com.wm.idq.util;

import com.wm.idq.constants.NumberConstants;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author 作者 E-mail: 346129023@qq.com
 * @date 创建时间: 2018-02-25
 */
public class CommonUtils {

    /**
     * 获得上个月，本月，下个月
     *
     * @param format String 日期格式
     * @return List<String>
     */
    public static List<String> initRecentMonths(String format) {
        List<String> recentMonths = new ArrayList<String>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        // 从下一个月开始计算
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, NumberConstants.ONE);
        for (int i = 0; i < NumberConstants.THREE; i++) {
            String formatMonth = simpleDateFormat.format(calendar.getTime());
            recentMonths.add(formatMonth);
            calendar.add(Calendar.MONTH, NumberConstants.MINUS_ONE);
        }
        return recentMonths;
    }
}
