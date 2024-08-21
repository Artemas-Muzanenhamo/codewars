package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayPrinterTest {
    @Test
    public void testInteger() {
    Integer[] array=new Integer[]{2,4,5,2};
      assertEquals("2,4,5,2",ArrayPrinter.printArray(array));
    }
}
