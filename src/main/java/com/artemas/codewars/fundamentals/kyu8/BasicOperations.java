package com.artemas.codewars.fundamentals.kyu8;

public class BasicOperations
{
  public static Integer basicMath(String op, int v1, int v2)
  {
    switch (op){
      case "+":
        return v1 + v2;
      case "-":
        return v1 - v2;
      case "*":
        return v1 * v2;
      case "/":
        if (v2 == 0){
          return 0;
        }else {
          return v1 / v2;}
      default:
        return null;
    }
  }
}