package com.streamAPI.task6;

import java.util.HashSet;
import java.util.Optional;

public class Searcher {
    public void findCar(HashSet<Car> cars, String model) {

        Optional<Car> carOptional = cars.stream().filter(p -> p.getModel().equalsIgnoreCase(model)).findAny();
        carOptional.ifPresent(System.out::println);

    }
    public void findCarModelWithException(HashSet<Car> cars, String model){
     Optional<Car> carOptional = cars.stream().filter(p -> p.getModel().equalsIgnoreCase(model)).findAny();
     if(carOptional.isPresent()){
      System.out.println(carOptional.get());
     }else

      System.out.println(carOptional.orElseThrow(NoSuchFieldError::new));
    }
    public void findModelAndTypeWithEx(HashSet<Car> cars, String model, String type){
     Optional<Car> car = cars.stream().filter(b -> b.getModel().equalsIgnoreCase(model)&&b.getType().equalsIgnoreCase(type)).findAny();
     car.ifPresentOrElse(c -> System.out.println(c),
             () -> System.out.println("no such car"));
    }
    public int modelAndTypeGetWeight(HashSet<Car> cars, String model, String type){
        Optional<Car> carOptional = cars.stream()
                .filter(b -> b.getModel().equalsIgnoreCase(model)&&b.getType().equalsIgnoreCase(type))
                .findAny();
        Car car = carOptional.orElseThrow();
        return car.getWeight();

    }
}
