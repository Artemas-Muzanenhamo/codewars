package com.artemas.codewars.fundamentals.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class NameArrayCappingTest {

    @Test
    public void testNames() {
        assertArrayEquals(new String[] {"Jo", "Nelson", "Jurie"}, NameArrayCapping.CapMe(new String[] {"jo", "nelson", "jurie"}));
        assertArrayEquals(new String[] {"Karly", "Daniel", "Kelsey"}, NameArrayCapping.CapMe(new String[] {"KARLY", "DANIEL", "KELSEY"}));
    }
}