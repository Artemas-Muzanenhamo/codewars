package com.artemas.codewars.fundamentals.kyu7;

public class HalvingSum {
  int halvingSum(int n) {
      if (n == 1){
          return n;
      } else {
          return n + halvingSum(n / 2);
      }
  }
}