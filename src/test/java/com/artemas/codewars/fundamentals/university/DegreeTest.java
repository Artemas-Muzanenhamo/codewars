package com.artemas.codewars.fundamentals.university;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DegreeTest {

    private static final String NAME = "artemas";
    private static final String SURNAME = "muza";
    private static final Degree DEGREE = new Degree("computer science");
    private static final String DEGREE_HERE = "no degree here!";
    private University university;

    @BeforeEach
    void setup() {
        university = new University();
    }

    @Test
    @DisplayName("Should return degree given a valid student")
    void returnDegreeGivenAValidStudent() {
        Student student = new Student(NAME, SURNAME, DEGREE);

        String degree = university.getDegree(student);
        String degree2 = university.getDegreeViaOptional(student);

        assertNotNull(degree);
        assertEquals(degree, DEGREE.getDegree());

        assertNotNull(degree2);
        assertEquals(degree2, DEGREE.getDegree());
    }

    @Test
    @DisplayName("Should return NO DEGREE HERE when student is null")
    void handleNullStudent() {
        String degree = university.getDegree(null);
        String degree2 = university.getDegreeViaOptional(null);

        assertEquals(degree, DEGREE_HERE);

        assertEquals(degree2, DEGREE_HERE);
    }

    @Test
    @DisplayName("Should return NO DEGREE HERE when a valid student has a null degree")
    void handleNullDegree() {
        Student student = new Student(NAME, SURNAME, null);

        String degree = university.getDegree(student);
        String degree2 = university.getDegreeViaOptional(student);

        assertEquals(degree, DEGREE_HERE);
        assertEquals(degree2, DEGREE_HERE);
    }
}
