package com.artemas.codewars.fundamentals.kyu6;

import org.junit.Test;

import static com.artemas.codewars.fundamentals.kyu6.SuperMarket.solveSuperMarketQueue;
import static org.junit.Assert.assertEquals;

public class SuperMarketTest {
	@Test
	public void testNormalCondition() {
		assertEquals(9, solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
	}

	@Test
	public void testEmptyArray() {
		assertEquals(0, solveSuperMarketQueue(new int[] {}, 1));
	}

	@Test
	public void testSingleTillManyCustomers() {
		assertEquals(15, solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
	}

}