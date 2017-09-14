package com.artemas.codewars.fundamentals;

class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {

    while(operator.equals("add")){
      return a + b;
    }

    while(operator.equals("subtract")){
      return a - b;
    }

    while(operator.equals("multiply")){
      return a * b;
    }

    while(operator.equals("divide")){
      return a / b;
    }

    return 0;
  }
}

/*
public class ArithmeticFunction {
  static Map<String, BinaryOperator<Integer>> operators = new HashMap<>();

  static {
    operators.put("add", (a, b) -> a + b);
    operators.put("subtract", (a, b) -> a - b);
    operators.put("multiply", (a, b) -> a * b);
    operators.put("divide", (a, b) -> a / b);
  }

  public static int arithmetic(int a, int b, String operator) {
    return arithmetic(a, b, operators.get(operator));
  }

  private static Integer arithmetic(int a, int b, BinaryOperator<Integer> operator) {
    return Optional.ofNullable(operator).orElse((x, y) -> 0).apply(a, b);
  }
}*/
