package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;

public class Suzuki
{
    public static long stairsIn20(int[][] stairs) {
        return Arrays.stream(stairs).flatMapToInt(m-> Arrays.stream(m)).sum() * 20;
    }
}