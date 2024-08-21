package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PythagoreanTripleTest{
    static int[] p1={3,4,5};
    static int[] p2={3,5,7};
   
    PythagoreanTriple pT = new PythagoreanTriple();

   @Test
    public void validTriple() {
        assertEquals(1, pT.pythagoreanTriple(p1));
    }
    
    public void invalidTriple(){
      assertEquals(0,pT.pythagoreanTriple(p2));
    }
}
