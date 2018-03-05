package com.artemas.codewars.fundamentals.kyu8;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AverageBestTest {
  @Test
  public void tests() {
    assertTrue(AverageBest.betterThanAverage(new int[] {2, 3}, 5));
    assertTrue(AverageBest.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
    assertFalse(AverageBest.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 9));
  }
}