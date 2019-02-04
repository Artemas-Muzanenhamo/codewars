package com.artemas.codewars.fundamentals.kyu7;


import org.apache.commons.lang3.StringUtils;

class Repeater {
    static String repeat(String string, long n) {
        return StringUtils.repeat(string, (int) n);
    }
}