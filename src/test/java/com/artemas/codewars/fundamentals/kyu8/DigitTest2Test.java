package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitTest2Test {
  
    DigitTest2 myUtil = new DigitTest2();

@Test
    public void test0() throws Exception 
    {   
        assertEquals(false,myUtil.isDigit("s2324"));
    }
     @Test
    public void test1() throws Exception 
    {   
        assertEquals(true,myUtil.isDigit("-234.4"));
    }

}
