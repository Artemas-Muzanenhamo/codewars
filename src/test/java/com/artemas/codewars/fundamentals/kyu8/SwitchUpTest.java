package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchUpTest {
    @Test
    public void basicTests() {
        assertEquals("One", SwitchUp.switchItUp(1));
        assertEquals("Three", SwitchUp.switchItUp(3));
        assertEquals("Five", SwitchUp.switchItUp(5));
    }
}
