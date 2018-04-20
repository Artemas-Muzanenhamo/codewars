package com.artemas.codewars.fundamentals.kyu7;

public class CheckTwoAndThree {
    public boolean checkThreeAndTwo(char[] chars) {
        int countA = 0;
        int countB = 0;
        int countC = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a'){
                countA += 1;
            } else if (chars[i] == 'b') {
                countB += 1;
            } else {
                countC += 1;
            }
        }

        return (countA >= 3 && (countB >= 2 || countC >= 2)) || (countB >= 3 && (countA >= 2 || countC >= 2)) || (countC >= 3 && (countB >= 2 || countA >= 2));
    }
}