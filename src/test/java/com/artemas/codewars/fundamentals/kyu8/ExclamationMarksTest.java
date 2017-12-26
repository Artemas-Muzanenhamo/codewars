package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExclamationMarksTest {

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", ExclamationMarks.removeExclamationMarks("Hello World!"));
    }
}