package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChromosomesTest {
    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", Chromosomes.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", Chromosomes.chromosomeCheck("XX"));
    }
}
