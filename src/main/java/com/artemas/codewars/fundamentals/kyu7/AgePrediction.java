package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

public class AgePrediction {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int[] ages = {age1, age2, age3, age4, age5, age6, age7, age8};
        // Multiply each number by itself.
        Double sum = Arrays.stream(ages)
                .mapToDouble(age  -> age*=age)
                // Add them all together.
                .sum();
        // Take the square root of the result.
        sum = Math.sqrt(sum);
        // Divide by two.
        sum/= 2;

        // return (int) Math.sqrt(of(ages).map(a->a*a).sum())/2;
        return sum.intValue();
    }
}