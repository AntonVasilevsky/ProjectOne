package com.geometry;

public class Quadrilateral extends Figure {
    private double sideA;
    private double sideB;

    public Quadrilateral(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    double calculatePerimeter() {
        return sideA*2+sideB*2;
    }

    @Override
    double calculateSquare() {
        return sideA*sideB;
    }

    @Override
    boolean compareTo(Object o) {
        if(!(o instanceof Quadrilateral)){
            return false;
        }
        else if(this.sideA!=((Quadrilateral) o).getSideA()||this.sideB!=((Cube) o).getSideB()){
            return false;
        }else
            return true;
    }
}
