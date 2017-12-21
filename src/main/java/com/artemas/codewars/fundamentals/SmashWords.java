package com.artemas.codewars.fundamentals;

import java.util.Arrays;
import java.util.Optional;

public class SmashWords {

	public static String smash(String... words) {

        String result = null;

        Optional<String[]> optionals = Optional.ofNullable(words);
        if (optionals.isPresent() && optionals.get().length == 1){
            result = optionals.get()[0];
        } else if (optionals.isPresent() && optionals.get().length > 1){
            //result = optionals.map(x -> Arrays.stream(x));
        }else if (optionals.get().length == 0){
            return "";
        }

        return result;
	}
}