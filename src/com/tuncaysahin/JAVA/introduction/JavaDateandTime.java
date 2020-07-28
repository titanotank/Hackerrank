package com.tuncaysahin.JAVA.introduction;

import java.time.LocalDateTime;

public class JavaDateandTime {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        LocalDateTime time = LocalDateTime.of(year,month,day,0,0);
        return time.getDayOfWeek().toString();

    }

    // altında kalan kısım otomatik gelen kod

}
