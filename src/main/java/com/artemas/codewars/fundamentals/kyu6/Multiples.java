package com.artemas.codewars.fundamentals.kyu6;

public class Multiples {

  public int solution(int number) {
      int value = 0;
      for (int i = 0; i < number; i++){
          if (i % 3 == 0 || i % 5 == 0){
              value += i;
          }
      }
      return value;
  }
}