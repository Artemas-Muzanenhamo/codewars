package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

public class MaxMin {

  public int min(int[] list) {
    return Arrays.stream(list).min().getAsInt();
  }
  
  public int max(int[] list) {
    return Arrays.stream(list).max().getAsInt();
  }
}