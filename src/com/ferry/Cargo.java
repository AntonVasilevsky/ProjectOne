package com.ferry;

import java.util.Random;

public class Cargo implements TransportObj{
    private double mass;
    private double volume;
    private double density;
    private String transportationType;
    private int id =0;

    public Cargo(double volume, double density){
        this.volume = volume;
        this.density=density;
        Random rnd = new Random();
        if (this.density>2){            //твердый груз случайно контейнер или платформа
            if(rnd.nextBoolean()) {
                transportationType = "container";
                id = 3;
            }else{
                transportationType = "platform";
                id = 2;
            }
        }else{
            transportationType = "tank";
            id = 4;
        }

    }

    @Override
    public double  calculateMass() {
        if (transportationType.equals("tank")) {
            mass = volume * density + 7000;
        } else if (transportationType.equals("container")||transportationType.equals("platform")) {
            mass = volume + density + 3500;
        }

        return mass;
    }



    public double getMass() {
        return mass;
    }

    public double getVolume() {
        return volume;
    }

    public double getDensity() {
        return density;
    }

    public int getId() {
        return id;
    }

    public String getTransportationType() {
        return transportationType;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "mass=" + mass +

                ", transportationType='" + transportationType + '\'';
    }
}
