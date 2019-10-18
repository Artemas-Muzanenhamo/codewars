package com.artemas.codewars.fundamentals.kyu7;


class EncapsulationDemo{
  private int number;
  private String stringValue;
  private Object anObject;

  public EncapsulationDemo() { }

  public EncapsulationDemo(int number, String stringValue, Object anObject) {
    this.number = number;
    this.stringValue = stringValue;
    this.anObject = anObject;
  }

  public int getNumber() {
    return number;
  }

  public String getStringValue() {
    return stringValue;
  }

  public Object getAnObject() {
    return anObject;
  }
}