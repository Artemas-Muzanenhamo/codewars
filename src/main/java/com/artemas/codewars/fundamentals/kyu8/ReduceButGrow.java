package com.artemas.codewars.fundamentals.kyu8;

import java.util.stream.IntStream;

public class ReduceButGrow {
    public static int grow(int[] input) {
        return IntStream.of(input)
                .reduce(1, (a, b) -> a * b);
    }

}