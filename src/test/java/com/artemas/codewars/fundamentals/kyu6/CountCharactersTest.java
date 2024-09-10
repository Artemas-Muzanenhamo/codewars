package com.artemas.codewars.fundamentals.kyu6;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.HashMap;

public class CountCharactersTest {

    @Test
    public void testEmptyString() {
        Map<Character, Integer> d = new HashMap<>();
        assertEquals(d, CountCharacters.count(""));
    }

    @Test
    public void testSingleCharacter() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        assertEquals(d, CountCharacters.count("a"));
    }

    @Test
    public void testMultipleCharacters() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 3);
        d.put('b', 3);
        d.put('c', 1);
        assertEquals(d, CountCharacters.count("aabbbac"));
    }

    @Test
    public void testAllCharactersUnique() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        d.put('b', 1);
        d.put('c', 1);
        assertEquals(d, CountCharacters.count("abc"));
    }

    @Test
    public void testAllCharactersSame() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 5);
        assertEquals(d, CountCharacters.count("aaaaa"));
    }

    @Test
    public void testDifferentCharacters() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = CountCharacters.count("aabb");
        assertEquals(expected, actual);
    }

}
