package com.artemas.codewars.fundamentals.kyu7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EncapsulationDemo{
  private int number;
  private String stringValue;
  private Object anObject;
}