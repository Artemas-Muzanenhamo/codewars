package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

public class MeanAverage {
    
    public static int findAverage(int[] nums) {

        return new Double(Arrays.stream(nums).average().getAsDouble()).intValue();
    }
}