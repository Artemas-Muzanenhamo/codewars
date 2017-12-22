package com.artemas.codewars.fundamentals;

public class Hello{
  public String sayHello(String [] name, String city, String state){
    return "Hello, " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!";
  }
}