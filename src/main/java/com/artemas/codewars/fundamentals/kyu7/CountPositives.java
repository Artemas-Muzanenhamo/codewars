package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

public class CountPositives
{
    public static int[] countPositivesSumNegatives(int[] input) {

        if (input != null){
            int positiveCount = (int) Arrays.stream(input)
                    .filter(number -> number > 0).count();

            int negativeSum = Arrays.stream(input)
                    .filter(number -> number < 0).sum();

            if (positiveCount != 0 && negativeSum != 0){
                return new int[]{positiveCount, negativeSum};
            } else {
                return input;
            }
        } else {
            return input;
        }
    }
}