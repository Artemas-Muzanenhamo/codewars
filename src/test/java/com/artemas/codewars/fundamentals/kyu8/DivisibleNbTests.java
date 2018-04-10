package com.artemas.codewars.fundamentals.kyu8;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class DivisibleNbTests {

    @Test
    public void test1() {
        assertEquals(true, DivisibleNb.isDivisible(12, 4, 3));
    }

    @Test
    public void test2() {
        assertEquals(false, DivisibleNb.isDivisible(3, 3, 4));
    }

}