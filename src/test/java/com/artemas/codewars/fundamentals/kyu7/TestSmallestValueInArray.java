package com.artemas.codewars.fundamentals.kyu7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;

public class TestSmallestValueInArray {

    @Test
    public void testSample() {
        assertEquals("The smallest index", 0, Arrayz.findSmallest(new int[]{1, 2, 3}, "index"));
        assertEquals("The smallest value", 2, Arrayz.findSmallest(new int[]{7, 12, 3, 2, 27}, "value"));
        assertEquals("The smallest index", 3, Arrayz.findSmallest(new int[]{7, 12, 3, 2, 27}, "index"));
    }
}