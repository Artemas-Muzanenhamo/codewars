package com.artemas.codewars.fundamentals.kyu8;

public class NthPower {
  public static int nthPower(int[] array, int n) {

    if (n < array.length){
      Double result =  Math.pow(array[n], n);
      return result.intValue();
    }
    return -1;
  }
}