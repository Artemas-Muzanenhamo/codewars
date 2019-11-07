package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

class Counter {
  int countSheeps(Boolean[] arrayOfSheeps) {

    Long presentSheeps = Arrays.stream(arrayOfSheeps)
            .filter(t -> t!=null && t.equals(true))
            .count();

    return presentSheeps.intValue();
  }
}