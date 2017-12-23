package com.artemas.codewars.fundamentals.kyu8;

public class CharProblem {
  public static int howOld(final String herOld) {
    Integer age = Integer.parseInt(herOld.substring(0,1));
    return age;
  }
}