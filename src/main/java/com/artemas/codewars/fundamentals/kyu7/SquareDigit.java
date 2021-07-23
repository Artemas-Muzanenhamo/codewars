package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class SquareDigit {

  public int squareDigits(int n) {
    final String numbersSquared = Arrays.stream(Integer.toString(n).split(""))
            .mapToInt(Integer::valueOf)
            .map(number -> (int) pow(number, 2))
            .mapToObj(String::valueOf)
            .collect(Collectors.joining());

    return parseInt(numbersSquared);

  }

}