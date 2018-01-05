package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BrokenPhotocopier {

  public static String broken(final String x) {

    String[] strings = x.split("");
    return Arrays.stream(strings)
            .map(number -> number.equals("1") ? number.replace("1", "0") : number.replace("0", "1"))
            .collect(Collectors.joining());
  }
  
}