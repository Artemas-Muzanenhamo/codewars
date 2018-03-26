package com.artemas.codewars.fundamentals.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class DigitizeExampleTests {
  @Test
  public void tests() {
    assertArrayEquals(new int[] {1, 3, 2, 5, 3}, DigitizeExample.digitize(35231));
  }
}