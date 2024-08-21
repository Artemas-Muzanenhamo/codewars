package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;

public class NameMeTest {

    @Test
    public void testNameMeOne() throws Exception {
        NameMe nameMe = new NameMe("John", "Doe");

        assertEquals("Verifying First name. Object returned should contain the firstname: John", "John", nameMe.getFirstName());
        assertEquals("Verifying Last name. Object returned should contain the lastname: Doe", "Doe", nameMe.getLastName());
        assertNotEquals("Verifying full name. Object returned should contain full name: John Doe", "JohnDoe", nameMe.getFullName());
        assertEquals("Verifying full name. Object returned should contain full name: John Doe", "John Doe", nameMe.getFullName());
        assertEquals("John Doe", nameMe.fullName);
    }
}
