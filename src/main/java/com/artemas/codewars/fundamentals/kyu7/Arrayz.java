package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arrayz {

  public static int findSmallest( final int[] numbers, final String toReturn ) {
      int smallVal = Arrays.stream(numbers).min().getAsInt();
      List<Integer> integers = Arrays.stream(numbers).boxed().collect(Collectors.toList());
      return (toReturn.equals("value")) ? smallVal : integers.indexOf(smallVal);
  }
}