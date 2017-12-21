package com.artemas.codewars.fundamentals;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;


public class NessieTest {
    @Test
    public void testBasicTrue() {
        String n = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy";
        System.out.println(n);
        assertTrue(Nessie.isLockNessMonster(n));
    }

    @Test
    public void testBasicTrueWithNumbers() {
        String n = "Your girlscout cookies are ready to ship. Your total comes to 3.50";
        System.out.println(n);
        assertTrue(Nessie.isLockNessMonster(n));
    }

    @Test
    public void testBasicFalse() {
        String n = "Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.";
        System.out.println(n);
        assertFalse(Nessie.isLockNessMonster(n));
    }
}