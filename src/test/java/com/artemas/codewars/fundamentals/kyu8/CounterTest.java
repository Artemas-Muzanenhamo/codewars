package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CounterTest {
    Boolean[] array1 = {true,  true,  true,  false,
                      true,  true,  true,  true ,
                      true,  false, true,  false,
                      true,  false, false, true ,
                      true,  true,  true,  true ,
                      false, false, true,  true };

    @Test
    public void test() {
      assertEquals("There are 17 sheeps in total", 17, new Counter().countSheeps(array1));
    }
}
