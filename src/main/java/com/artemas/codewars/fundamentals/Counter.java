package com.artemas.codewars.fundamentals;

import java.util.Arrays;

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {

    Long presentSheeps = Arrays.stream(arrayOfSheeps)
            .filter(t -> t!=null && t.equals(true))
            .count();

    return presentSheeps.intValue();
  }
}