package com.artemas.codewars.fundamentals.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StrayNumberTest {
  
  @Test
  public void simpleArray1() {
    assertEquals(2, getActualFor(1, 1, 2));
  }
  
  private int getActualFor(int... numbers) {
    return StrayNumber.stray(numbers);
  }
}