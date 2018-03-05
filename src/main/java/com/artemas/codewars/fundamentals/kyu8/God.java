package com.artemas.codewars.fundamentals.kyu8;

public class God {
    public static Human[] create() {
        Human man = new Man();
        Human woman = new Woman();
        return new Human[]{man, woman};
    }
}

class Human {

}

class Man extends Human {
}

class Woman extends Human {
}