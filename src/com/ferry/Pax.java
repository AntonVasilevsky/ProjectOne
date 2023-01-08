package com.ferry;

public class Pax implements TransportObj{
    private double mass;
    private String transportationType = "platform";
    private int id = 1;
    public Pax(double mass){
        this.mass=mass;
    }
    public int getId() {
        return id;
    }

    @Override
    public double calculateMass() {
        return mass;
    }

    public String getTransportationType() {
        return transportationType;
    }

    @Override
    public String toString() {
        return "Pax{" +
                "mass=" + mass +
                ", transportationType='" + transportationType + '\'' +
                '}';
    }
}
