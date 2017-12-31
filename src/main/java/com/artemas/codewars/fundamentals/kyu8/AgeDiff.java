package com.artemas.codewars.fundamentals.kyu8;

public class AgeDiff
{
  public static String CalculateAge(int birth, int yearTo) {

    String ageOld = "";
    String age = "";

    if (yearTo - birth == 1 || birth - yearTo == 1){
      ageOld = " year old.";
      age = " year.";
    } else {
      ageOld = " years old.";
      age = " years.";
    }

    if (yearTo > birth) {
      return "You are "+ (yearTo - birth) + ageOld;
    } else if (yearTo < birth) {
      return "You will be born in " + (birth - yearTo) + age;
    } else {
      return "You were born this very year!";
    }
  }
}