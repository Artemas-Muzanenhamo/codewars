package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

public class AverageBest {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
      double average = Arrays.stream(classPoints).average().orElse(0);
      return yourPoints > average;
  }
}