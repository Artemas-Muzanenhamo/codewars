package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

public class ReduceButGrow {
    public static int grow(int[] input) {
        return Arrays.stream(input)
                .reduce(1, (a, b) -> a * b);
    }

}