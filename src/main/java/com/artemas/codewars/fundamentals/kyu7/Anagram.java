package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

public class Anagram {
  public static boolean isAnagram(String test, String original) {
      test = test.toLowerCase();
      original = original.toLowerCase();
      char testArray[] = test.toCharArray();
      char originalArray[] = original.toCharArray();
      Arrays.sort(testArray);
      Arrays.sort(originalArray);

      return new String(testArray).equals(new String(originalArray)) ? true : false;

  }
}