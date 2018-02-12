package com.artemas.codewars.fundamentals.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class ChristmasListTest {
    @Test
    public void basicTest() {
        ArrayList<String> santasList = new ArrayList<String>();
        ArrayList<String> children = new ArrayList<String>();
        for(String s : new String[] {"Jason", "Jackson", "Jordan", "Johnny"})
        santasList.add(s);
        for(String s : new String[] {"Jason", "Jordan", "Jennifer"})
        children.add(s);
        ArrayList<String> goodChildren = new ArrayList<String>();
        
        for(String s : new String[] {"Jason", "Jordan"}) {
            goodChildren.add(s);
        }
        assertEquals(goodChildren, ChristmasList.findChildren(santasList, children));
    }
    
    @Test
    public void sortingTest() {
        ArrayList<String> santasList = new ArrayList<String>();
        ArrayList<String> children = new ArrayList<String>();
        for(String s : new String[] {"Jason", "Jackson", "Johnson", "JJ"})
        santasList.add(s);
        for(String s : new String[] {"Jason", "James", "JJ"})
        children.add(s);
        ArrayList<String> goodChildren = new ArrayList<String>();
        
        for(String s : new String[] {"JJ", "Jason"}) {
            goodChildren.add(s);
        }
        assertEquals(goodChildren, ChristmasList.findChildren(santasList, children));
    }
    
    @Test
    public void capitalizationTest() {
        ArrayList<String> santasList = new ArrayList<String>();
        ArrayList<String> children = new ArrayList<String>();
        for(String s : new String[] {"jASon", "JAsoN", "JaSON", "jasON"})
        santasList.add(s);
        for(String s : new String[] {"JasoN", "jASOn", "JAsoN", "jASon", "JASON"})
        children.add(s);
        ArrayList<String> goodChildren = new ArrayList<String>();
        
        for(String s : new String[] {"JAsoN", "jASon"}) {
            goodChildren.add(s);
        }
        assertEquals(goodChildren, ChristmasList.findChildren(santasList, children));
    }
}