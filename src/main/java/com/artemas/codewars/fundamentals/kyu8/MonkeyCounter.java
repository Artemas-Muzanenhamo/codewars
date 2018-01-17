package com.artemas.codewars.fundamentals.kyu8;

public class MonkeyCounter {
  public static int[] monkeyCount(final int n){

      int[] arr = new int[n];

      for (int i = 0; i < n; i++){
          arr[i] = i + 1;
      }

      return arr;
  }
}