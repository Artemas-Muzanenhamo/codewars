package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class PipesExampleTests {
  @Test
  public void tests() {
    assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, PipesExample.pipeFix(new int[] {1,2,3,5,6,8,9}));
    assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, PipesExample.pipeFix(new int[] {1,2,3,12}));
    assertArrayEquals(new int[] {6,7,8,9}, PipesExample.pipeFix(new int[] {6,9}));
    assertArrayEquals(new int[] {-1,0,1,2,3,4}, PipesExample.pipeFix(new int[] {-1,4}));
    assertArrayEquals(new int[] {1,2,3}, PipesExample.pipeFix(new int[] {1,2,3}));
  }
}