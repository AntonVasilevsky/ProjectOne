package com.streamAPI.task6;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Car> cars = new HashSet<>();
        cars.add(new Car("Audi", "SW", 1350, 5));
        cars.add(new Car("Audi", "HB", 1200, 5));
        cars.add(new Car("BMW", "Sedan", 1200, 4));
        cars.add(new Car("BMW", "SW", 1200, 5));
        cars.add(new Car("Mercedes", "SW", 1200, 5));
        cars.add(new Car("Mercedes", "SUW", 1200, 5));
        cars.add(new Car("Fiat", "500", 1150, 3));
        cars.add(new Car("Fiat", "Panda", 950, 5));
        cars.add(new Car("Volvo", "SUV", 1450, 5));
        cars.add(new Car("Volvo", "Sedan", 1235, 4));
        Searcher s = new Searcher();
        //s.findCarModelWithException(cars, "Volvo");
        //s.findCarModelWithException(cars, "SSS");
        /*s.findModelAndTypeWithEx(cars, "bmw", "SW");
        s.findModelAndTypeWithEx(cars, "bmwq", "SW");
        System.out.println(s.modelAndTypeGetWeight(cars, "bmw", "SW"));*/
        modelAndDoors(cars, "bmw", 6);




    }
    public static void modelAndDoors(HashSet<Car> cars, String model, int doors){
        Optional<Car> carOptional = cars.stream().filter(car -> car.getModel()
                .equalsIgnoreCase(model)&&car.getNumberOfDoors()==doors).findAny();
        carOptional.ifPresentOrElse(System.out::println,
                () -> System.out.println(cars.stream().findAny().get())); // выводим любую машину
               // ()-> System.out.println("null")); // кажется, что не этого хотят в задании

    }
}
