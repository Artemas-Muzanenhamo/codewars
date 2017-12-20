package com.artemas.codewars.fundamentals;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class UpperTest {

Upper u = new Upper();

    @Test
    public void testSomething() {
       assertEquals("HELLO",u.MakeUpperCase("hello"));
    }
}