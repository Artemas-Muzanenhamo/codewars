package com.artemas.codewars.fundamentals.kyu6;

import java.util.Arrays;

class SuperMarket {


    // TODO: https://www.codewars.com/kata/the-supermarket-queue/train/java
    static int solveSuperMarketQueue(int[] customers, int n) {
        int totalCustomer = Arrays.stream(customers)
                .sum();

        return totalCustomer / n;
    }

}