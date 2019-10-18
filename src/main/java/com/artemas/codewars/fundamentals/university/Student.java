package com.artemas.codewars.fundamentals.university;

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

    public Degree getDegree() {
        return degree;
    }
}
