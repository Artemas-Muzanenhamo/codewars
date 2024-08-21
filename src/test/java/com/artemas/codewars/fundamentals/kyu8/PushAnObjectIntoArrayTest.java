package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PushAnObjectIntoArrayTest {

    @Test
    public void testSomething() {
      List<String> items = PushAnObjectIntoArray.push();
      assertEquals(1,items.size());
      assertEquals("an object", items.get(0));
    }
}
