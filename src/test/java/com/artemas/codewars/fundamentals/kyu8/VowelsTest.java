package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
      assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}
