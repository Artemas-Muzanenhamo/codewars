package com.artemas.codewars.fundamentals.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncapsulationDemoTest {
    @Test
    public void testSample() {
     EncapsulationDemo ed = new EncapsulationDemo();
      assertEquals(0,ed.getNumber());
    }
}