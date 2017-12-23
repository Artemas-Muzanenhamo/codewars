package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberStringExampleTests {
  @Test
  public void tests() {
    assertEquals("67", NumberStringExample.numberToString(67));
    assertEquals("123", NumberStringExample.numberToString(123));
    assertEquals("999", NumberStringExample.numberToString(999));
  }
}