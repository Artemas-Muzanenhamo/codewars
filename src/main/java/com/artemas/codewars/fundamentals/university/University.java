package com.artemas.codewars.fundamentals.university;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

class University {

    private static final String OTHER = "no degree here!";

    String getDegree(Student student) {
        return Stream.of(student)
                .filter(Objects::nonNull)
                .map(Student::getDegree)
                .filter(Objects::nonNull)
                .map(Degree::getDegree)
                .findFirst()
                .orElse(OTHER);
    }


    String getDegreeViaOptional(Student student) {
        return Optional.ofNullable(student)
                .map(Student::getDegree)
                .map(Degree::getDegree)
                .orElse(OTHER);
    }
}
