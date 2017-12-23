package com.artemas.codewars.fundamentals.kyu8;

public class GreetMe{
  public static String greet(String name){
    name = name.toLowerCase();
    String firstLetter = name.substring(0, 1).toUpperCase();
    String jointLetters = name.substring(1, name.length());
    name = "Hello " + firstLetter + jointLetters + "!";
    return name;
  }
}