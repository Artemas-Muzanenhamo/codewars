package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatItTest {

    @Test
    public void testStar() {
        repeatTest("*", 3, "***");
    }

    @Test
    public void testHello() {
        repeatTest("Hello", 11, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello");
    }

    @Test
    public void testHelloNumber() {
        repeatTest(1, 11, "Not a string");
    }

    @Test
    public void testHelloBoolean() {
        repeatTest(true, 3, "Not a string");
    }

    @Test
    public void testHelloArray() {
        repeatTest(new int[]{1, 2, 3}, 3, "Not a string");
    }

    public void repeatTest(final Object toRepeat, final int n, final String expected) {
        final String testMessage = String.format("Testing with toRepeat = %s and n = %d", toRepeat, n);
        assertEquals(expected, RepeatIt.repeatString(toRepeat, n), testMessage);
    }
}
