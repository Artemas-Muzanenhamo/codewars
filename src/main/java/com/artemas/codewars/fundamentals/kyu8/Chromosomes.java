package com.artemas.codewars.fundamentals.kyu8;

public class Chromosomes {
  public static String chromosomeCheck(String sperm) {
      return sperm.equals("XY") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
  }
}