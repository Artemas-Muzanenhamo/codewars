package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class MaxMinTest {

    private MaxMin maxMin = new MaxMin();
    
    @Test
    public void testExamples() {
        assertEquals(-110, maxMin.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, maxMin.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, maxMin.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, maxMin.max(new int[]{5}));
    }
}