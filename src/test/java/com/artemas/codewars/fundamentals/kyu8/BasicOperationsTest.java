package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.runners.JUnit4;

public class BasicOperationsTest
{
  BasicOperations basicOps = new BasicOperations();
  
  @Test
  public void testBasics()
  {
    System.out.println("Basic Tests");
    assertThat(basicOps.basicMath("+", 4, 7), is(11));
    assertThat(basicOps.basicMath("-", 15, 18), is(-3));
    assertThat(basicOps.basicMath("*", 5, 5), is(25));
    assertThat(basicOps.basicMath("/", 49, 7), is(7));
    assertThat(basicOps.basicMath("/", 49, 0), is(0));
  }
}
