package com.artemas.codewars.fundamentals.kyu6;

import java.util.Arrays;

public class PangramChecker {
  public boolean check(String sentence){
//      String valueWithNoSpaces = sentence.replaceAll("\\s+", "");
//      String valueWithAlphabeticCharsOnly = valueWithNoSpaces.replaceAll("[^a-zA-Z]", "");
//      
//      return 26 == Arrays.stream(valueWithAlphabeticCharsOnly.split(""))
//              .map(String::toLowerCase)
//              .distinct()
//              .count();

      return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
  }
}