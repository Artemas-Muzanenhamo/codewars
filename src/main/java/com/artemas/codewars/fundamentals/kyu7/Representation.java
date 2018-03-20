package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

public class Representation {
    public static int daysRepresented(int[][] trips) {
        int value = Arrays.stream(trips)
                .flatMapToInt(array -> Arrays.stream(array))
                .reduce(0, (a, b) -> (b - a));

        value += trips.length;

        return value;
    }
}