package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

public class InvertValues {
  public static int[] invert(int[] array) {
    return java.util.Arrays.stream(array).map(i -> -i).toArray();
  }
}