package com.artemas.codewars.fundamentals.kyu8;

public class CatDogYears {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
      int catYears = humanYears;
      int dogYears = humanYears;

      if (catYears == 1) {
          catYears = 15;
      } else if (catYears == 2) {
          catYears = 15 + 9;
      } else if (catYears > 2) {
          catYears = 24 + 4 * (catYears - 2);
      }

      if (dogYears == 1) {
          dogYears = 15;
      } else if (dogYears == 2) {
          dogYears = 15 + 9;
      } else if (dogYears > 2) {
          dogYears = 24 + 5 * (dogYears - 2);
      }

      return new int[] {humanYears, catYears, dogYears};
  }

}