package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetMeTests {
GreetMe greetme = new GreetMe();
  @Test
  public void basicTests() {
    assertEquals("Hello Riley!", greetme.greet("riley"));
  }
}
