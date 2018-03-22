package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

class SectionalArray {
    static int[] sort(final int[] array, final int start, final int... length) {
        if (length.length == 0){
            Arrays.sort(array, start, array.length);
        } else {
            Arrays.sort(array, start, array.length - 1);
        }
        return array;
    }
}