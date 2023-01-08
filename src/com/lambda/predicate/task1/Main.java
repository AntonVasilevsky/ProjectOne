package com.lambda.predicate.task1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.equals("abc");
        System.out.println(predicate.test("aba"));
        Function<Integer, Boolean> function = (i) -> {
               if(i>0)
                   return true;
               return false;
        };
        function.apply(-1);
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        Consumer<String> consumer2 = s -> System.out.println(s.toLowerCase());
        consumer.andThen(consumer2).accept("hello WORLD");
        String t = "abc";
        Supplier<String> supplier = () -> t.toUpperCase();
        System.out.println(supplier.get());
    }
}
