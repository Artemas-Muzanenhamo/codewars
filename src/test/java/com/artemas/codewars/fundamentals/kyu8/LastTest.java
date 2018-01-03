package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LastTest {
    @Test public void testList() {
        final List<Integer> list = Arrays.asList(1, 2 ,3 ,4 ,5);
        final int last = Last.last(list);
        assertEquals(5, last);
    }
    @Test public void testString() {
        final String string = "abcde";
        final char last = Last.last(string);
        assertEquals('e', last);
    }
    @Test public void testArgs() {
        final int last = Last.last(1, 2 ,3 ,4 ,5);
        assertEquals(5, last);
    }
    @Test public void testArray() {
        final Integer[] array = {1, 2 ,3 ,4 ,5};
        final int last = Last.last(array);
        assertEquals(5, last);
    }
}
