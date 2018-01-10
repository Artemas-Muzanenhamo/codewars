package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SumTest {
    @Test
    public void sampleTests() {
        assertEquals(21, Sum.arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertEquals(-21, Sum.arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
        assertEquals(15, Sum.arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
        assertEquals(2100, Sum.arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
    }
}