package com.artemas.codewars.fundamentals;

import java.util.List;
class sorter {
  public static List<String> sort(List<String> textbooks) {

    textbooks.sort(String::compareToIgnoreCase);
    return textbooks;

  }
}