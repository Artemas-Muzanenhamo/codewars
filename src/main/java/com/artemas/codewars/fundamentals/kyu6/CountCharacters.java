package com.artemas.codewars.fundamentals.kyu6;

import java.util.Map;
import java.util.function.Function;

import static java.util.Arrays.stream;
import static java.util.function.Predicate.not;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class CountCharacters {
    public static Map<Character, Integer> count(String str) {
        return stream(str.split(""))
                .filter(not(String::isBlank))
                .map(value -> value.charAt(0))
                .collect(groupingBy(Function.identity(), summingInt(x -> 1)));
    }
}