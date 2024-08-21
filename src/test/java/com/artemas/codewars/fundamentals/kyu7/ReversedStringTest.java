package com.artemas.codewars.fundamentals.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedStringTest {
    @Test
    public void sampleTests() {
      assertEquals("dlrow", ReversedString.solution("world"));
    }
}
