package com.artemas.codewars.fundamentals.university;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private Degree degree;

    public Student() { }

    public Student(String name, String surname, Degree degree) {
        this.name = name;
        this.surname = surname;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    Degree getDegree() {
        return degree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(degree, student.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, degree);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", degree=" + degree +
                '}';
    }
}
