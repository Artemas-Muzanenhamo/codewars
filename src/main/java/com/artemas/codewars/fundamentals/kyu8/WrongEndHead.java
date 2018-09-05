package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

import static java.util.Collections.swap;

public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    swap(Arrays.asList(arr) , 0 , 2);
    return arr;
  }
}