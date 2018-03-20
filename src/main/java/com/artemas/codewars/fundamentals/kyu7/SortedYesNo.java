package com.artemas.codewars.fundamentals.kyu7;

import java.util.stream.IntStream;

class SortedYesNo {
  
  public static String isSortedAndHow(int[] array) {
      if(IntStream.range(0, array.length-1).allMatch(i -> array[i] <= array[i+1]))
          return "yes, ascending";

      if(IntStream.range(0, array.length-1).allMatch(i -> array[i] >= array[i+1]))
          return "yes, descending";

      return "no";
  }
  
}