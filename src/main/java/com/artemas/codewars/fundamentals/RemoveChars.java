package com.artemas.codewars.fundamentals;

import java.util.Optional;

public class RemoveChars {
    public static String remove(String str) {

        Optional<String> stringOptional = Optional.ofNullable(str);
        if (stringOptional.isPresent() && stringOptional.get().length() >= 2){
            str = stringOptional.get().substring(1);
            str = str.substring(0, str.length() - 1);
            return str;
        }

        return str;
    }
}