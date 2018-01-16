package com.artemas.codewars.fundamentals.kyu8;

import java.util.concurrent.TimeUnit;

public class Clock
{
  public static int Past(int h, int m, int s) {
      long time = TimeUnit.HOURS.toMillis(h) + TimeUnit.MINUTES.toMillis(m) + TimeUnit.SECONDS.toMillis(s);
      return (int)time;
  }
}