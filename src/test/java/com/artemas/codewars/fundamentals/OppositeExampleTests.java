package com.artemas.codewars.fundamentals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OppositeExampleTests {
  @Test
  public void tests() {
    assertEquals(-1, OppositeExample.opposite(1));
    assertEquals(1, OppositeExample.opposite(-1));
  }
}