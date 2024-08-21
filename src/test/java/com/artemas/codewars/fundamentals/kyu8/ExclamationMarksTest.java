package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExclamationMarksTest {

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", ExclamationMarks.removeExclamationMarks("Hello World!"));
    }
}
