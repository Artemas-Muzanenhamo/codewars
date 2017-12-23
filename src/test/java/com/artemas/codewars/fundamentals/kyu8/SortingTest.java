package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;


public class SortingTest {
    
    @Test
    public void basicTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        for(String s : new String[] {"Algebra", "History", "Geometry", "English"})
        strs.add(s);
        for(String s : new String[] {"Algebra", "English", "Geometry", "History"})
      sorted.add(s);
        assertEquals(sorted, sorter.sort(strs));
    }
    
    @Test
    public void capitalizationTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        for(String s : new String[] {"Algebra", "history", "Geometry", "english"})
        strs.add(s);
        for(String s : new String[] {"Algebra", "english", "Geometry", "history"})
      sorted.add(s);
        assertEquals(sorted, sorter.sort(strs));
    }
    
    @Test
    public void symbolsTest() {
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> strs = new ArrayList<>();
        for(String s : new String[] {"Alg#bra", "$istory", "Geom^try", "**English"})
        strs.add(s);
        for(String s : new String[] {"$istory", "**English", "Alg#bra", "Geom^try"})
      sorted.add(s);
        assertEquals(sorted, sorter.sort(strs));
    }
    
    
}