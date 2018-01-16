package com.artemas.codewars.fundamentals.kyu8;

public class Clock
{
  public static int Past(int h, int m, int s) {
      return 1000*(s+60*(m+60*h));
  }
}