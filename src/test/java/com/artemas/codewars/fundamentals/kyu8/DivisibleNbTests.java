package com.artemas.codewars.fundamentals.kyu8;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisibleNbTests {

    @Test
    public void test1() {
        assertTrue(DivisibleNb.isDivisible(12, 4, 3));
    }

    @Test
    public void test2() {
        assertFalse(DivisibleNb.isDivisible(3, 3, 4));
    }

}
