package com.artemas.codewars.fundamentals.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IsogramTest {
    @Test
    public void FixedTests() {
        assertEquals(Isogram.isIsogram("Dermatoglyphics"), true);
        assertEquals(Isogram.isIsogram("Isogram") , true);
        assertEquals(Isogram.isIsogram("moose") , false);
        assertEquals(Isogram.isIsogram("isIsogram") , false);
        assertEquals(Isogram.isIsogram("aba") , false);
        assertEquals(Isogram.isIsogram("moOse") , false);
        assertEquals(Isogram.isIsogram("thumbscrewjapingly") , true);
        assertEquals(Isogram.isIsogram("") , true);
    }
}