package com.artemas.codewars.fundamentals.kyu8;

import java.util.*;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {

        // Break the String into Arrays.
        String[] firstString = s1.split("");
        String[] secString = s2.split("");

        // To hold our final String.
        String outcome = "";

        /**
         *
         * Personally if I wanted it to be more readable I would do it this way
         * and then pass the list into the TreeSet.
         *
         * List<String> list = new ArrayList<String>(Arrays.asList(firstString));
         * List<String> list1 = new ArrayList<String>(Arrays.asList(secString));
         *
         * */

        SortedSet<String> set = new TreeSet<String>();

        // Add the String[]s into the TreeSet to have order and eliminate duplicates.
        set.addAll(Arrays.asList(firstString));
        set.addAll(Arrays.asList(secString));

        for (String elementValue: set) {
            outcome += elementValue;
        }




        return outcome;
        
    }
}