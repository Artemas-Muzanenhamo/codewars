package com.artemas.codewars.fundamentals.kyu7;

import java.util.stream.Stream;

class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
        long first = Stream.of(a1).count();
        long second = Stream.of(a2).count();
        return Math.toIntExact(first + second);
    }
}