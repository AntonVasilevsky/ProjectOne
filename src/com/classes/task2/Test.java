package com.classes.task2;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer, Boolean> function = integer -> {
            if(integer%2==0){
                return true;
            }
            return false;
        };
        System.out.println(function.apply(2));


    }
}
