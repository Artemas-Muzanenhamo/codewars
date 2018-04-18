package com.artemas.codewars.fundamentals.kyu6;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class AggregationKata4 {

    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment(Stream<Student> students) {
        return students.collect(
                groupingBy(
                        Student::getDepartment,
                        groupingBy(Student::getGender, counting())
                )
        );
    }

}



