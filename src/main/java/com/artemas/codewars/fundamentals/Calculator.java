package com.artemas.codewars.fundamentals;

public class Calculator
{
  public static Double calculate(final double numberOne, final String operation, final double numberTwo)
  {
    Double Result = null;

    if (operation.equals("+")){
      Result = numberOne + numberTwo;
    }else if (operation.equals("-")){
      Result = numberOne - numberTwo;
    }else if (operation.equals("*")){
      Result = Math.abs(numberOne * numberTwo);
    }else if (operation.equals("/")){
      if (numberTwo == 0){
        Result = null;
      }else {
        Result = numberOne / numberTwo;
      }
    }

    return Result;
  }
}