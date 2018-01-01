package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestWordTest {

  @Test
  public void basicTests() {
    // assertEquals("expected", "actual");
    assertEquals(7, LongestWord.findLongest("The quick white fox jumped around the massive dog"));
    assertEquals(10, LongestWord.findLongest("Take me to tinseltown with you"));
    assertEquals(7, LongestWord.findLongest("Sausage chops"));
    assertEquals(6, LongestWord.findLongest("Wind your body and wiggle your belly"));
    assertEquals(7, LongestWord.findLongest("Lets all go on holiday"));
  }
}