package com.exeption;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);


    }
}
