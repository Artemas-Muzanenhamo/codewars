package com.artemas.codewars.fundamentals.kyu7;

class ReverseLetter {
    static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}