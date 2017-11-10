package com.artemas.codewars.fundamentals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GreetMeTests {
GreetMe greetme = new GreetMe();
  @Test
  public void basicTests() {
    assertEquals("Hello Riley!", greetme.greet("riley"));
  }
}