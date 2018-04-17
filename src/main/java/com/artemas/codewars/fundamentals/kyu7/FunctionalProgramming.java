package com.artemas.codewars.fundamentals.kyu7;

import java.util.function.Function;

public class FunctionalProgramming {
  public static Function<Student, Boolean> f =
          student -> student.getFullName().equals("John Smith") && student.studentNumber.equals("js123");
}