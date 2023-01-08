package com.classes.trip;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Testy {
    public static void main(String[] args) {
        Consumer<String> consumer = (x) -> System.out.println(x.toUpperCase());
        consumer.accept("abc");
        Predicate<String> predicate = (i) -> i.equals("abc");
        System.out.println(predicate.test("abc"));
        Function<Integer, Boolean> function = (a) -> a>0;
        System.out.println(function.apply(0));
    }
}

