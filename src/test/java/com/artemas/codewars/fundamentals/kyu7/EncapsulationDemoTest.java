package com.artemas.codewars.fundamentals.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncapsulationDemoTest {
    @Test
    public void testSample() {
     EncapsulationDemo ed = new EncapsulationDemo();
      assertEquals(0,ed.getNumber());
    }
}
