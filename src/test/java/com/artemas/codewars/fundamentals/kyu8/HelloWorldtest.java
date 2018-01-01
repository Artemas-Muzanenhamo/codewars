package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class HelloWorldtest {
    @Test
    public void testSomething() {
        assertEquals("hello world!", HelloWorld.greet());
    }
}