package com.artemas.codewars.fundamentals.kyu7;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class MyLanguagesTest {
  @Test
  public void basicTests() {
    final Map<String, Integer> map1 = new HashMap<>();
    map1.put("Java", 10);
    map1.put("Ruby", 80);
    map1.put("Python", 65);
    assertEquals(Arrays.asList("Ruby", "Python"), MyLanguages.myLanguages(map1));
    final Map<String, Integer> map2 = new HashMap<>();
    map2.put("Hindi", 60);
    map2.put("Dutch", 93);
    map2.put("Greek", 71);
    assertEquals(Arrays.asList("Dutch", "Greek", "Hindi"), MyLanguages.myLanguages(map2));
    final Map<String, Integer> map3 = new HashMap<>();
    map3.put("C++", 50);
    map3.put("ASM", 10);
    map3.put("Haskell", 20);
    assertEquals(Collections.emptyList(), MyLanguages.myLanguages(map3));
  }
}