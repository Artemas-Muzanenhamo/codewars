package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindPositionTest {

    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", FindPosition.position('a'));
        assertEquals("Position of alphabet: 26", FindPosition.position('z'));
        assertEquals("Position of alphabet: 5", FindPosition.position('e'));
    }
}