package com.artemas.codewars.fundamentals.kyu7;

public class Cockroach{
  public int cockroachSpeed(double x){
    return (int) Math.floor((x * 100000) / 60 / 60);
  }
}