package com.artemas.codewars.fundamentals.kyu7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.reverseOrder;
import static java.util.Map.*;
import static java.util.Map.Entry.*;

class MyLanguages {
  static List<String> myLanguages(final Map<String, Integer> results) {
    return results.entrySet()
            .stream()
            .filter(res -> res.getValue() >= 60)
            .sorted(comparingByValue(reverseOrder()))
            .map(Entry::getKey)
            .collect(Collectors.toList());
  }
}