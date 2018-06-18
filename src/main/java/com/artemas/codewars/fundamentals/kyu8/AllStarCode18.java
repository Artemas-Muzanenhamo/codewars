package com.artemas.codewars.fundamentals.kyu8;

public class AllStarCode18 {
  public static int strCount(String str, char letter) {
      return (int)str.chars().filter( n -> n == letter).count();
  }
}