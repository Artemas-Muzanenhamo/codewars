package com.artemas.codewars.fundamentals.kyu7;

public class MiddleExample {
  public static String getMiddle(String word) {
      return word.length() == 1 ? word :
              word.length() % 2 == 0 ?
                      word.substring((word.length() / 2) - 1, (word.length() / 2) + 1 ):
                      word.substring( (word.length() - 1) / 2, (word.length() - 1) / 2 + 1 );
  }
}