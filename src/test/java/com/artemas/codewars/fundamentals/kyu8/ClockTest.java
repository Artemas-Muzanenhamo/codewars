package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClockTest {
    @Test    
    public void test1(){
        assertEquals(61000, Clock.Past(0,1,1));
    }

  
}
