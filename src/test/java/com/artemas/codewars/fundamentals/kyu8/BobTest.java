package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BobTest {
    @Test
    public void testBob() {
        Assert.assertEquals("Should return 0.", 0, Bob.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, Bob.enough(100, 60, 50));
    }
}