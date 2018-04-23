package com.artemas.codewars.fundamentals.kyu6;

import org.apache.commons.lang3.text.WordUtils;

public class CamelCaseMethod {

    public static String camelCase(String str) {
        if (!str.isEmpty()){
            str = str.trim();
            str = str.trim().replaceAll(" +", " ");
            str = WordUtils.capitalizeFully(str, new char[]{' '}).replaceAll(" ", "");
            return str;
        } else {
            return str;
        }
    }

/*    public static String camelCase(String str) {
        return str == null || str.isEmpty() ? "" : Arrays.asList(str.split(" ")).stream()
                .map(str1 -> str1.trim().length() > 0 ? str1.substring(0, 1).toUpperCase() + str1.substring(1, str1.length()).toLowerCase() : "")
                .collect(Collectors.joining(""));
    }*/

}
