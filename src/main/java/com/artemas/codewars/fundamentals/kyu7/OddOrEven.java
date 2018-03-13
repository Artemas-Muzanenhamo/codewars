package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

public class OddOrEven {
  public static String oddOrEven (int[] array) {
      return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
  }
}