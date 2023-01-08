package com.functionalapproach.imperative.streams;

import com.functionalapproach.imperative.Main;

public class _Stream {
    public static void main(String[] args) {

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
