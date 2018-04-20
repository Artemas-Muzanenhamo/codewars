package com.artemas.codewars.fundamentals.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckTwoAndThreeTest {
    @Test
    public void testSomething() {
        assertEquals(true, new CheckTwoAndThree().checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        assertEquals(false, new CheckTwoAndThree().checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        assertEquals(false, new CheckTwoAndThree().checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
        assertEquals(false, new CheckTwoAndThree().checkThreeAndTwo(new char[] { 'b', 'b', 'b', 'b', 'b' }));
        assertEquals(true, new CheckTwoAndThree().checkThreeAndTwo(new char[] { 'c', 'c', 'c', 'a', 'a' }));
    }
}