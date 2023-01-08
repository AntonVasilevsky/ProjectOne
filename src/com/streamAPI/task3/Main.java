package com.streamAPI.task3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Animal> animals = getAnimals();

       /* for (Animal a : animals
        ) {
            if (a.getClassification().equals(Classification.CARNIVORE)) {
                predators.add(a);
            }
        }*/
        List<Animal> predators =  animals.stream().filter(animal -> animal.getClassification().equals(Classification.CARNIVORE))
                        .collect(Collectors.toList());
        predators.forEach(System.out::println);
    }

    static List<Animal> getAnimals() {
       return List.of(
                new Animal("Lion", 10, Classification.CARNIVORE),
        new Animal("Elephant", 32, Classification.VEGAN),
        new Animal("Wolf", 7, Classification.CARNIVORE),
        new Animal("Rabbit", 3, Classification.VEGAN),
        new Animal("Bear", 8, Classification.MIX),
        new Animal("Monkey", 10, Classification.MIX));

    }

}
