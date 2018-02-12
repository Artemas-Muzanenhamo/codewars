package com.artemas.codewars.fundamentals.kyu7;

import java.util.List;
import java.util.stream.Collectors;

class ChristmasList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        return santasList.stream()
                .filter(child -> children.contains(child))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}