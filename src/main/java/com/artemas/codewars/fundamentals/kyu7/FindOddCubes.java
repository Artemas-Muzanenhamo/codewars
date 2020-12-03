package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class FindOddCubes {

    public static int cubeOdd(int arr[]) {
        return stream(arr)
                .filter(number -> number % 2 != 0)
                .map(oddNumber -> oddNumber * oddNumber * oddNumber)
                .sum();
    }
}
