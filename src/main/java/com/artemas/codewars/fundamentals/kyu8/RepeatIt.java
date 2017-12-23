package com.artemas.codewars.fundamentals.kyu8;

import java.util.Collections;

public class RepeatIt {

  public static String repeatString(final Object toRepeat, final int n) {
    try {
      if (toRepeat.getClass().getName().equals("java.lang.Integer")){
        return "Not a string";
      } else if (toRepeat.getClass().getName().equals("java.lang.Boolean")){
        return "Not a string";
      } else if (toRepeat.getClass().isArray()){
        return "Not a string";
      }else {
        return String.join("", Collections.nCopies(n, toRepeat.toString()));
      }
    } catch (Exception e){
      e.getMessage();
    }
    return null;
  }
  
}