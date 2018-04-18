package com.artemas.codewars.fundamentals.kyu6;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationKata2 {

    public static Map<String, Long> getNumberOfStudentsByDepartment(Stream<Student> students) {
        return students.collect(
                Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.counting()
                )
        );
    }

}