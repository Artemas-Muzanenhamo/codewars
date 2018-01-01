package com.artemas.codewars.fundamentals.kyu8;

import static org.junit.Assert.*;
import org.junit.Test;

public class MeanAverageTest {

	@Test
	public void test1() {
    	assertEquals(1, MeanAverage.findAverage(new int[]{1}));
	}

	@Test
	public void test2() {
    	assertEquals(4, MeanAverage.findAverage(new int[]{1,3,5,7}));
	}
}