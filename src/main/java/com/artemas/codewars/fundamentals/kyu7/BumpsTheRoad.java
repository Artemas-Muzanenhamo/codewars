package com.artemas.codewars.fundamentals.kyu7;

public class BumpsTheRoad {
    public static String bumps(final String road) {
        String road1 = road.toLowerCase();
        return (road.length() - road.replaceAll("[n]", "").length()) < 15 ? "Woohoo!" : "Car Dead";
    }
}