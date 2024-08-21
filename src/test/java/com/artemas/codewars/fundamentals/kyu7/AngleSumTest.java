package com.artemas.codewars.fundamentals.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AngleSumTest {
    @Test
    public void sampleTests() {
        assertEquals(180, AngleSum.sumOfAngles(3));
        assertEquals(360, AngleSum.sumOfAngles(4));
    }
}
