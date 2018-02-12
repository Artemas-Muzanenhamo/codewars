package com.artemas.codewars.fundamentals.kyu7;

import java.util.*;

public class ListDescription {

  public static String describeList(final List list) {
      long elementCount = list.stream().count();
      if (elementCount > 0){
          if (elementCount < 2){
              return "singleton";
          }else {
              return "longer";
          }
      } else {
          return "empty";
      }
  }
  
}