package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;

public class NameArrayCapping {
    public static String[] CapMe(String[] strings) {
        return Arrays.stream(strings).map(name -> name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase()).toArray(String[]::new);
    }
}
