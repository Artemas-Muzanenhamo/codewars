package com.artemas.codewars.fundamentals.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class PangramTest {
    @Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }
}