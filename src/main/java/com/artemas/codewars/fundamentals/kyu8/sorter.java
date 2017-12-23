package com.artemas.codewars.fundamentals.kyu8;

import java.util.List;
class sorter {
  public static List<String> sort(List<String> textbooks) {

    textbooks.sort(String::compareToIgnoreCase);
    return textbooks;

  }
}