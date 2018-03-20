package com.artemas.codewars.fundamentals.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SortedYesNoTest {
    
    @Test
    public void test1() {
        int[] array = new int[] {1, 2};
        assertEquals("yes, ascending", SortedYesNo.isSortedAndHow(array));
    }
    
    @Test
    public void test2() {
        int[] array = new int[] {15, 7, 3, -8};
        assertEquals("yes, descending", SortedYesNo.isSortedAndHow(array));
    }
    
    @Test
    public void test3() {
        int[] array = new int[] {4, 2, 30};
        assertEquals("no", SortedYesNo.isSortedAndHow(array));
    }
    
}