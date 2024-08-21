package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldtest {
    @Test
    public void testSomething() {
        assertEquals("hello world!", HelloWorld.greet());
    }
}
