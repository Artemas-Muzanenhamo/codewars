package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

public class OddOrEven {
  public static String oddOrEven (int[] array) {
      int sum = 0;

      sum = Arrays.stream(array).sum();

      if (sum % 2 == 0) {
          return "even";
      } else {
          return "odd";
      }
  }
}