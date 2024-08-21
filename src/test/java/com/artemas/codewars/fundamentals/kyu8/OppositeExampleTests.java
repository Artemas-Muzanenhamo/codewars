package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OppositeExampleTests {
  @Test
  public void tests() {
    assertEquals(-1, OppositeExample.opposite(1));
    assertEquals(1, OppositeExample.opposite(-1));
  }
}
