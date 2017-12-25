package com.artemas.codewars.fundamentals.kyu8;

public class StringUtils {
  
  public static String toAlternativeString(String string) {

    String newString = "";

    char[] characters = string.toCharArray();
    for (char character: characters) {
      if (Character.isLowerCase(character)){
        character = Character.toUpperCase(character);
      }else {
        character = Character.toLowerCase(character);
      }

      newString += Character.toString(character);
    }

    return newString;
  }
}