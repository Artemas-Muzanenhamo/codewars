package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculateTest {
    @Test
    public void testBMI() {
        Assert.assertEquals("Normal", Calculate.bmi(80, 1.80));
    }
}