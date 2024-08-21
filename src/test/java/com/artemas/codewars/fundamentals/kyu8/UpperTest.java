package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpperTest {

Upper u = new Upper();

    @Test
    public void testSomething() {
       assertEquals("HELLO",u.MakeUpperCase("hello"));
    }
}
