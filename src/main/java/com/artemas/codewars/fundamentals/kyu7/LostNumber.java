package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

public class LostNumber {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        return Arrays.stream(arr)
                .filter(arrElement -> Arrays.stream(mixedArr).noneMatch(mixedElement -> arrElement == mixedElement))
                .findFirst()
                .orElse(0);
    }
}