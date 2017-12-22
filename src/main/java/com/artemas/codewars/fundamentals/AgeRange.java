package com.artemas.codewars.fundamentals;

public class AgeRange {
  public static String datingRange(int age) {

    int min = (age / 2) + 7;
    int max = (age - 7) * 2;

    if (age <= 14){
      Double minAge = age - 0.10 * age;
      Double maxAge = age + 0.10 * age;

      min = minAge.intValue();
      max = maxAge.intValue();
    }

    return min + "-" + max;
  }
}