package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindAverageTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, FindAverage.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, FindAverage.find_average(new int[]{1, 2, 3}), DELTA);
    }
}