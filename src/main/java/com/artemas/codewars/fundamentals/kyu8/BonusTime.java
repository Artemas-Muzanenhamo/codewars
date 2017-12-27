package com.artemas.codewars.fundamentals.kyu8;

public class BonusTime {
  public static String bonusTime(final int salary, final boolean bonus) {
    return (bonus) ? "£" + (salary * 10) : "£" + salary;
  }
}