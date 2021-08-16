package com.artemas.codewars.fundamentals.kyu8;

import java.util.stream.IntStream;

class FirstNonConsecutive {
    static Integer find(final int[] array) {
//        if (array.length == 0 || array.length == 1) {
//            return null;
//        }
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] - (array[i - 1]) > 1) {
//                return array[i];
//            }
//        }
//
//        return null;
        return IntStream
                .range(1, array.length)
                .filter(i -> array[i] - array[i - 1] != 1)
                .mapToObj(i -> array[i])
                .findFirst()
                .orElse(null);
    }
}