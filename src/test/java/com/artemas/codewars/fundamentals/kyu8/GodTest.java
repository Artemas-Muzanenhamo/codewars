package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class GodTest {   
    @Test
    public void makingAdam(){
      Human[] paradise = God.create();
        assertTrue("Adam are a man", paradise[0] instanceof Man);
        assertTrue("Eve are a woman", paradise[1] instanceof Woman);
    }
}
