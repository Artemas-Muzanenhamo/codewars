package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

public class DigitizeExample {
  public static int[] digitize(long n) {

      /**
       * Elegant Solution...
       * return new StringBuilder().append(n)
       * .reverse()
       * .chars()
       * .map(Character::getNumericValue)
       * .toArray();
       */

      String numbers = Long.toString(n);
      StringBuilder sb = new StringBuilder(numbers);
      numbers = sb.reverse().toString();
      String[] numbersArr = numbers.split("");
      int[] arrays = Arrays.stream(numbersArr).mapToInt(Integer::parseInt).toArray();
      return arrays;
  }
}