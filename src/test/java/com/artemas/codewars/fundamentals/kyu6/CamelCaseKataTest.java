package com.artemas.codewars.fundamentals.kyu6;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseKataTest {
    @Disabled
    @Test
    public void tests() {
      assertEquals( "Incorrect", "camel Casing", CamelCaseKata.camelCase("camelCasing"));
      assertEquals( "Incorrect", "camel Casing Test", CamelCaseKata.camelCase("camelCasingTest"));
      assertEquals( "Incorrect", "camelcasingtest", CamelCaseKata.camelCase("camelcasingtest"));
    }
}
