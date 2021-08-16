package com.artemas.codewars.fundamentals.kyu8;

import java.util.stream.DoubleStream;

public class SumArray {

  public static double sum(double[] numbers) {
    return DoubleStream.of(numbers).sum();
  }
}