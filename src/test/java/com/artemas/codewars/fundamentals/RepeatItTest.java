package com.artemas.codewars.fundamentals;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RepeatItTest {
  
  @Test
  public void testStar() {
    repeatTest("*", 3, "***");
  }
  
  @Test
  public void testHello() {
    repeatTest("Hello", 11, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");
  }

  @Test
  public void testHelloNumber() {
    repeatTest(1, 11, "Not a string");
  }

  @Test
  public void testHelloBoolean() {
    repeatTest(true, 3, "Not a string");
  }

  @Test
  public void testHelloArray() {
    repeatTest(new int[]{1, 2, 3}, 3, "Not a string");
  }
  
  public void repeatTest(final Object toRepeat, final int n, final String expected) {
    final String testMessage = String.format("Testing with toRepeat = %s and n = %d", toRepeat, n);
    assertEquals(testMessage,  expected, RepeatIt.repeatString(toRepeat, n));
  }
}