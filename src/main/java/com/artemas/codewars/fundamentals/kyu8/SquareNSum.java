package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

import static java.lang.Math.pow;

public class SquareNSum {

    private SquareNSum() { }

    public static int squareSum(int[] n) {
        return Arrays.stream(n)
                .map(number -> (int) pow(number, 2))
                .sum();
    }
}
