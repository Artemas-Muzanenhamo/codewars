package com.artemas.codewars.fundamentals;

public class PythagoreanTriple {

    public int pythagoreanTriple(int[] triple){

        if (Math.pow(triple[0], 2) + Math.pow(triple[1], 2) == Math.pow(triple[2], 2)){
            return 1;
        }else {
            return 0;
        }
    }

	
}