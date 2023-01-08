package com.geometry;

public class Cube extends Figure3d{
    private double sideA;
    private double sideB;
    private double height;

    public Cube(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return sideA*4+sideB*4+height+4;
    }

    @Override
    double calculateSquare() {
        return 2*(sideA*sideB+sideA*height+sideB*height);
    }

    @Override
    boolean compareTo(Object o) {
        if(!(o instanceof Cube)){
            return false;
        }
        else if(this.sideA!=((Cube) o).getSideA()||this.sideB!=((Cube) o).getSideB()||this.height!=((Cube) o).getHeight()){
            return false;
        }else
        return true;
    }

    @Override
    double calculateVolume() {
        return sideA*sideB*height;
    }
}
