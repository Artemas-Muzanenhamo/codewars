package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {
  private Number num;
  
  @BeforeEach
  public void setUp() throws Exception {
    num = new Number();
  }

  @AfterEach
  public void setDown() throws Exception {
    num = null;
  }
  
  @Test
  public void test() {
    assertEquals(true, num.isEven(0));
    assertEquals(false, num.isEven(0.5));
    assertEquals(false, num.isEven(1));
    assertEquals(true, num.isEven(2));
    assertEquals(true, num.isEven(-4)); 
  }
}
