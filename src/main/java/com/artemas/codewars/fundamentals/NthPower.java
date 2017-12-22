package com.artemas.codewars.fundamentals;

public class NthPower {
  public static int nthPower(int[] array, int n) {

    if (n < array.length){
      Double result =  Math.pow(array[n], n);
      return result.intValue();
    }
    return -1;
  }
}