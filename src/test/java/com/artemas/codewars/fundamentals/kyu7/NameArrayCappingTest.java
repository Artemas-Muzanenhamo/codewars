package com.artemas.codewars.fundamentals.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameArrayCappingTest {

    @Test
    public void testNames() {
        assertArrayEquals(new String[] {"Jo", "Nelson", "Jurie"}, NameArrayCapping.CapMe(new String[] {"jo", "nelson", "jurie"}));
        assertArrayEquals(new String[] {"Karly", "Daniel", "Kelsey"}, NameArrayCapping.CapMe(new String[] {"KARLY", "DANIEL", "KELSEY"}));
    }
}
