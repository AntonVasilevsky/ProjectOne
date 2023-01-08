package com.streamAPI.task6;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Catalog {

    public Optional<Car>findByModel(Set<Car> cars, String model){

       return  cars.stream().filter(b -> b.getModel().equals(model)).findAny();
    }
    public Optional<Car>findByModelandType(Set<Car> cars, String model, String type){
        return cars.stream().filter(b -> b.getModel().equals(model)&&b.getType().equals(type)).findAny();
    }
    public Optional<Car>findByWeightAndModel(Set<Car> cars, String model, int weight){
        return cars.stream().filter(b -> b.getModel().equals(model)&&b.getWeight()==weight).findAny();
    }





}
