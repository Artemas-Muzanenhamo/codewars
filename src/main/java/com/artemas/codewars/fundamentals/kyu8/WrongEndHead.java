package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;
import java.util.Collections;

public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    Collections.swap(Arrays.asList(arr) , 0 , 2);
    return arr;
  }
}