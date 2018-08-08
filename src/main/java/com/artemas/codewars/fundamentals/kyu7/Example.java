package com.artemas.codewars.fundamentals.kyu7;

public class Example {

    public static void main(String[] args) {
        String a = "nArtemas___";

        System.out.println(a.length() - a.replaceAll( "[_n]", "").length());
    }
}
