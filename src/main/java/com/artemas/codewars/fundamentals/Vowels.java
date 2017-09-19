package com.artemas.codewars.fundamentals;

public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    String[] array;

    array = str.split("");

    for (String string :array) {
      if (string.equals("a") || string.equals("e") || string.equals("i") || string.equals("o") || string.equals("u")){
        vowelsCount++;
      }
    }

    return vowelsCount;
  }

}
