package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

public class FindAverage {
  public static double find_average(int[] array){

     Double average = Arrays.stream(array).average().getAsDouble();

     return average;

  }
}