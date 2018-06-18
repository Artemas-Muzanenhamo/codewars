package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AllStarCode18Test {
    @Test
    public void testSomething() {
         assertEquals(AllStarCode18.strCount("Hello", 'o'),1);
         assertEquals(AllStarCode18.strCount("Hello", 'l'),2);
         assertEquals(AllStarCode18.strCount("",'z'),0);
    }
}