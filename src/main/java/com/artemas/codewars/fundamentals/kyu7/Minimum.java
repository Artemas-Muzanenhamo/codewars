package com.artemas.codewars.fundamentals.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

class Minimum {

	static int minValue(int[] values){

		String string = Arrays.stream(values)
				.mapToObj(String::valueOf)
				.distinct()
				.sorted()
				.collect(Collectors.joining(""));

		return Integer.parseInt(string);

	}

}