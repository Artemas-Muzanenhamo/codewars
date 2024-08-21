package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BanjoExampleTest {
  @Test
  public void PeopleThatPlayBanjo() {
    assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
    assertEquals( "Nope!" , Banjo.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
  }
}
