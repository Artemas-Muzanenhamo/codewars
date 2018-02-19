package com.artemas.codewars.fundamentals.kyu8;

import java.util.stream.IntStream;

public class PipesExample {
  public static int[] pipeFix(int[] numbers) {
      int[] arr =  IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
      return arr;
  }
}