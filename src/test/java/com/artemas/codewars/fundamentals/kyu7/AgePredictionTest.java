package com.artemas.codewars.fundamentals.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgePredictionTest {
    @Test
    public void FixedTests() {
        assertEquals(86, AgePrediction.predictAge(65,60,75,55,60,63,64,45));
        assertEquals(79, AgePrediction.predictAge(32,54,76,65,34,63,64,45));
    }
}
