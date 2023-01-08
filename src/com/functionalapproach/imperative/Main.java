package com.functionalapproach.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import static com.functionalapproach.imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people =  List.of(
            new Person("Anton", MALE),
            new Person("Alex", MALE),
            new Person("Anna", FEMALE),
            new Person("Olga", FEMALE),
            new Person("Snezha", FEMALE)
        );

        people.stream()
                .filter((p) -> p.gender.equals(FEMALE))

                .forEach(System.out::println);

        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a*b;
        System.out.println(biFunction.apply(2,3));
        BiConsumer<String, Double> biConsumer = (c, d) -> {
            System.out.println(c.toUpperCase());
            System.out.println(Math.pow(d, 3));
        };
        biConsumer.accept("abc", 2d);

    }
    static class Person{
        private String name;
        private Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Peson{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    static enum Gender{
        MALE, FEMALE
    }
}
