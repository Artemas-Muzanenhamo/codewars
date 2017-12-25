package com.artemas.codewars.fundamentals.kyu8;

import java.util.Collections;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return (repeat > 0) ?  string.join("", Collections.nCopies(repeat, string)) : "";
    }
}