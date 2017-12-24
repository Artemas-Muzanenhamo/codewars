package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DinglemouseTest {

  @Test
  public void testSomeDots() {
    assertEquals("Sorry, try again :-(", "one-two-three", Dinglemouse.replaceDots("one.two.three"));
  }

}