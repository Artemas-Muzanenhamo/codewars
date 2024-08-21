package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GhostCodeTest {
    @Test
    public void exampleTests() {
        String result = GhostCode.helloName("Javatlacati");
        //                    message                                     expected               actual
        assertEquals("Hello my name is Javatlacati is not " + result, "Hello my name is Javatlacati", result);
    }
}
