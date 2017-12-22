package com.artemas.codewars.fundamentals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AgeRangeTest {

  @Test
  public void exampleTests(){
    assertEquals("15-20", AgeRange.datingRange(17));
    assertEquals("27-66", AgeRange.datingRange(40));
    assertEquals("14-16", AgeRange.datingRange(15));
    assertEquals("24-56", AgeRange.datingRange(35));
    assertEquals("9-11", AgeRange.datingRange(10));
  }
}