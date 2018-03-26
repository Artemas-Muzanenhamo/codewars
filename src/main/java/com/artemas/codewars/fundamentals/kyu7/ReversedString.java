package com.artemas.codewars.fundamentals.kyu7;

public class ReversedString {

  public static String solution(String str) {
      StringBuilder builder = new StringBuilder(str);
      return builder.reverse().toString();
  }

}