package com.artemas.codewars.fundamentals.kyu8;

import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SayHelloTest {
    @Test
    public void test1() {
        assertEquals("Hello, Mr. Spock", SayHello.sayHello("Mr. Spock"));
    }
    @Test
    public void test2() {
        assertEquals("Hello, Captain Kirk", SayHello.sayHello("Captain Kirk"));
    }
    @Test
    public void test3() {
        assertEquals("Hello, Liutenant Uhura", SayHello.sayHello("Liutenant Uhura"));
    }
    @Test
    public void test4() {
        assertEquals("Hello, Dr. McCoy", SayHello.sayHello("Dr. McCoy"));
    }
}