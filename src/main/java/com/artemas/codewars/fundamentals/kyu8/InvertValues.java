package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

public class InvertValues {
  public static int[] invert(int[] array) {

    int index = 0;
    for (int value: array) {
      if (value >= 0){
        array[index] = -value;
      }else {
        array[index] = Math.abs(value);
      }

      index++;
    }

    return array;
  }
}