package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class WrongEndHeadTest {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new String[]{ "head", "body", "tail" },
          WrongEndHead.fixTheMeerkat(new String[]{ "tail", "body", "head" }));
    }
    
    @Test
    public void exampleTest2() {
        assertArrayEquals(new String[]{ "heads", "body", "tails" },
          WrongEndHead.fixTheMeerkat(new String[]{ "tails", "body", "heads" }));
    }
    
  
    @Test
    public void exampleTest3() {
        assertArrayEquals(new String[]{ "bottom", "middle", "top" },
          WrongEndHead.fixTheMeerkat(new String[]{ "top", "middle", "bottom" }));
    }
    
    @Test
    public void exampleTest4() {
        assertArrayEquals(new String[]{ "lower legs", "torso", "upper legs" },
          WrongEndHead.fixTheMeerkat(new String[]{ "upper legs", "torso", "lower legs" }));
    }
    
    @Test
    public void exampleTest5() {
        assertArrayEquals(new String[]{ "ground", "rainbow", "sky" },
          WrongEndHead.fixTheMeerkat(new String[]{ "sky", "rainbow", "ground" }));
    }
}