package com.artemas.codewars.fundamentals.kyu7;

import java.util.concurrent.TimeUnit;

public class TimeUtils {
  public static String convertTime(int timeDiff) {
    int day = (int) TimeUnit.SECONDS.toDays(timeDiff);
    long hours = TimeUnit.SECONDS.toHours(timeDiff) - (day *24);
    long minute = TimeUnit.SECONDS.toMinutes(timeDiff) - (TimeUnit.SECONDS.toHours(timeDiff)* 60);
    long second = TimeUnit.SECONDS.toSeconds(timeDiff) - (TimeUnit.SECONDS.toMinutes(timeDiff) *60);

    return day + " " + hours + " " + minute + " " + second;
  }
}