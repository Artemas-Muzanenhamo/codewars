package com.artemas.codewars.fundamentals.kyu7;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ListDescriptionTest {

  @Test
  public void examples() {
    // assertEquals("expected", "actual");
    assertEquals("empty", ListDescription.describeList(Arrays.asList(new Object[0])));
    assertEquals("singleton", ListDescription.describeList(Arrays.asList(1)));
    assertEquals("longer", ListDescription.describeList(Arrays.asList(1,2)));
    assertEquals("empty", ListDescription.describeList(Arrays.asList(new Object[0])));
    assertEquals("singleton", ListDescription.describeList(Arrays.asList(1.5)));
    assertEquals("longer", ListDescription.describeList(Arrays.asList(1.5,2.5)));
  }
}