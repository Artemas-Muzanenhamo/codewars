package com.artemas.codewars.fundamentals.kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FindOddCubesTest {
    @Test
    @DisplayName("Should return the sum of odd numbers cubed")
    void testSomething() {
        assertEquals(0, FindOddCubes.cubeOdd(new int[] {-5, -5, 5, 5}));
        assertEquals(28, FindOddCubes.cubeOdd(new int[] {1, 2, 3, 4}));
        assertEquals(0, FindOddCubes.cubeOdd(new int[] {-3, -2, 2, 3}));
    }
}
