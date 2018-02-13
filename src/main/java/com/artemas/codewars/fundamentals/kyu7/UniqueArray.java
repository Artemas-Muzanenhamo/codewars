package com.artemas.codewars.fundamentals.kyu7;

import java.util.*;

public class UniqueArray {
    public static int[] unique(int[] integers) {
        return Arrays.stream(integers).distinct().toArray();
    }
}