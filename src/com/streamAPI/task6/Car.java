package com.streamAPI.task6;

public class Car {
    private String model;
    private String type;
    private int weight;
    private int numberOfDoors;

    public Car(String model, String type, int weight, int numberOfDoors) {
        this.model = model;
        this.type = type;
        this.weight = weight;
        this.numberOfDoors = numberOfDoors;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
