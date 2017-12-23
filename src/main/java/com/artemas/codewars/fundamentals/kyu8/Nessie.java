package com.artemas.codewars.fundamentals.kyu8;

import java.util.Optional;

public class Nessie {
    public static boolean isLockNessMonster(String s){

        boolean isLockMonster = false;

        Optional<String> stringOptional = Optional.ofNullable(s);

        if (stringOptional.isPresent()){
            if (stringOptional.get().contains("tree fiddy")){
                isLockMonster = true;
            }else if (stringOptional.get().contains("3.50")){
                isLockMonster = true;
            }
        }

        return isLockMonster;
    }
}