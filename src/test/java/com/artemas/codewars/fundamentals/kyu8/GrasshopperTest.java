package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GrasshopperTest {
    @Test
    public void testAddFive() {
      assertEquals(10, Grasshopper.addFive(5));
    }

    @Test
    public void testAddZero() {
      assertEquals(5, Grasshopper.addFive(0));
    }

    @Test
    public void testAddNegativeFive() {
      assertEquals(0, Grasshopper.addFive(-5));
    }

    @Test
    public void testRandom() {
      for (int i = 0; i < 50; i++) {
        int rand = (int)(Math.random() * 1000) + 1;
        assertEquals(rand+5, Grasshopper.addFive(rand));
      }
    }
}