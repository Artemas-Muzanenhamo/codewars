package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {

    public static String printArray(Object array[]) {

//        String value = "";
//        for (Object obj : array) {
//            value += obj.toString();
//        }
//
//        String[] arr = value.split("");
//
//        return String.join(",", arr);

        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}