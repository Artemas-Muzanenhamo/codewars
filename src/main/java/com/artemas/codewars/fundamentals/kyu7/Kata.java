package com.artemas.codewars.fundamentals.kyu7;

import java.util.*;

public class Kata {

	public static int[] flattenAndSort(int[][] array) {
		return Arrays.stream(array)
				.flatMapToInt(Arrays::stream)
				.sorted()
				.toArray();

	}

}
