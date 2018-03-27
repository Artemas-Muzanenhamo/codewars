package com.artemas.codewars.fundamentals.kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class AnagramTest {
  @Test
  public void exampleTests() {
    Anagram k = new Anagram();
    
    assertEquals(true, k.isAnagram("foefet", "toffee"));
    assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
    assertEquals(true, k.isAnagram("Twoo", "Woot"));
    assertEquals(false, k.isAnagram("apple", "pale"));
  }
}