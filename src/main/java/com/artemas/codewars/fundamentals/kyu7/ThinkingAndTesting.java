package com.artemas.codewars.fundamentals.kyu7;

public class ThinkingAndTesting {

  public static int testAB(int a, int b, String operator) {
      switch (operator) {
          case "+":
              return a + b;
          case "-":
              return a - b;
          case "*":
              return a * b;
          default:
              return b / a;
      }
  }

    public static int testAB(int a, int b) {
        return a;
    }
}