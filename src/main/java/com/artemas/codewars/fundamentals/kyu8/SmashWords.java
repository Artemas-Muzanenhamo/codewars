package com.artemas.codewars.fundamentals.kyu8;

import java.util.Arrays;
import java.util.Optional;

public class SmashWords {

	public static String smash(String... words) {

        String result = null;

        Optional<String[]> strings = Optional.ofNullable(words);

        if (strings.isPresent()){
            result = String.join(" ", strings.get());
        }

        return result;
	}
}