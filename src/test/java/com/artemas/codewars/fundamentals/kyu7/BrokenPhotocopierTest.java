package com.artemas.codewars.fundamentals.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrokenPhotocopierTest {

  @Test
  public void tests() {
    // assertEquals("expected", "actual");
    assertEquals("0", BrokenPhotocopier.broken("1"));
    assertEquals("01111111010010000001100110111", BrokenPhotocopier.broken("10000000101101111110011001000"));
    assertEquals("011101", BrokenPhotocopier.broken("100010"));
  }
  
}
