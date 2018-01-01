package com.artemas.codewars.fundamentals.kyu8;

public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    return Double.parseDouble(String.format("%.2f", number));
  }
}