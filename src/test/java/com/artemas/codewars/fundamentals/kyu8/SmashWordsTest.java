package com.artemas.codewars.fundamentals.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmashWordsTest {

	@Test
    public void validate() {
		assertEquals("Bilal Djaghout", SmashWords.smash(new String[] { "Bilal", "Djaghout" }));
	}
	
	@Test
	public void validateEmpty() {
		assertEquals("", SmashWords.smash(new String[] {}));
	}
	
	@Test
	public void validateOneWord() {
		assertEquals("Bilal", SmashWords.smash(new String[] {"Bilal"}));
	}
	
}
