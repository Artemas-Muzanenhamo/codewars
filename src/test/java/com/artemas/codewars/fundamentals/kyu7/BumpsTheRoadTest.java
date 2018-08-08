package com.artemas.codewars.fundamentals.kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class BumpsTheRoadTest {
  
    @Test
    public void basicTest() {
        assertEquals(BumpsTheRoad.bumps("n"), "Woohoo!");
        assertEquals(BumpsTheRoad.bumps("_nnnnnnn_n__n______nn__nn_nnn"), "Car Dead");
        assertEquals(BumpsTheRoad.bumps("______n___n_"), "Woohoo!");
        assertEquals(BumpsTheRoad.bumps("nnnnnnnnnnnnnnnnnnnnn"), "Car Dead");
    }
}