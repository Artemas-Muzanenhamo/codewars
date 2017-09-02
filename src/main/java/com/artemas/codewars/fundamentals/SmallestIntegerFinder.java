package com.artemas.codewars.fundamentals;

import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {

        Arrays.sort(args);
        return args[0];

//        MY ORIGINAL SOLUTION....
//
//        int minimumValue = 0;
//
//        List<Integer> integerList = new ArrayList<Integer>();
//
//        for (int number: args) {
//            integerList.add(number);
//        }
//
//        minimumValue = Collections.min(integerList);
//
//        return minimumValue;

    }
}
