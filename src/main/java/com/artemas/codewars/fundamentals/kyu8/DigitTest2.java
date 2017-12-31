package com.artemas.codewars.fundamentals.kyu8;

public class DigitTest2 {

  public boolean isDigit(String s) {

    boolean isDigit = false;

      try {
        s = s.trim();
        Double number = Double.parseDouble(s);
        number = Math.abs(number);
        if (number.getClass().equals(Double.class)){
          isDigit = true;
        }
      }catch (Exception e){
        isDigit = false;
      }

      return isDigit;
  }
}