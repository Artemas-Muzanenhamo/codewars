package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

class StrayNumber {
  static int stray(int[] numbers) {
      // elegant solution = return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
      int[] sortedArr = Arrays.stream(numbers).sorted().toArray();
      if (sortedArr[0] != sortedArr[(sortedArr.length - 1) / 2]){
          return sortedArr[0];
      }else {
          return sortedArr[sortedArr.length - 1];
      }
  }
}