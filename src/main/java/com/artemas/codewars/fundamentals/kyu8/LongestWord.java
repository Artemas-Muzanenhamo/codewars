package com.artemas.codewars.fundamentals.kyu8;

import java.util.*;

public class LongestWord {

  public static int findLongest(final String str) {
    String[] spl = str.split(" ");
    int longest = 0;
    for (int i=0; i < spl.length; i++) {
      if (spl[i].length() > longest) {
        longest = spl[i].length();
      }
    }

    return longest;
  }
  
}