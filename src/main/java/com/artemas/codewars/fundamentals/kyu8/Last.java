package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;
import java.util.List;

public class Last {
    public static <T> T last(final List<T> list) {
        return list.stream().skip(list.stream().count() - 1).findFirst().get();
    }

    public static char last(final String string) {
        return string.charAt(string.length() - 1);
    }

    public static <T> T last(final T... list) {
        long count = Arrays.stream(list).count();
        return Arrays.stream(list).skip(count - 1).findFirst().get();
    }
}