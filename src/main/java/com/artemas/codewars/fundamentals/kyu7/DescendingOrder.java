package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import static java.util.Arrays.stream;
import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.joining;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return parseInt(stream(valueOf(num).split(""))
                .map(Integer::valueOf)
                .sorted(reverseOrder())
                .map(String::valueOf)
                .collect(joining()));
    }
}
