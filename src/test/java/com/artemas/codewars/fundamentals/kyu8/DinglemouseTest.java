package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DinglemouseTest {

  @Test
  public void testSomeDots() {
    assertEquals("Sorry, try again :-(", "one-two-three", Dinglemouse.replaceDots("one.two.three"));
  }

}
