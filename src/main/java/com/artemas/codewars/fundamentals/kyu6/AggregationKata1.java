package com.artemas.codewars.fundamentals.kyu6;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationKata1 {

    public static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {
        return students.collect(
                Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.averagingDouble(Student::getGrade)
                )
        );
    }

}
