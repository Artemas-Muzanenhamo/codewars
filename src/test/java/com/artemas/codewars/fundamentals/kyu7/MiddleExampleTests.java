package com.artemas.codewars.fundamentals.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleExampleTests {
  @Test
  public void evenTests() {
    assertEquals("es", MiddleExample.getMiddle("test"));
    assertEquals("dd", MiddleExample.getMiddle("middle"));
  }
  
  @Test
  public void oddTests() {
    assertEquals("t", MiddleExample.getMiddle("testing"));
    assertEquals("A", MiddleExample.getMiddle("A"));
  }
}
