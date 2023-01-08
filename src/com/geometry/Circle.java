package com.geometry;

public class Circle extends Figure{
    private double radius;
    final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    @Override
    double calculatePerimeter() {
        return 2*PI*radius;
    }

    @Override
    double calculateSquare() {
        return PI*Math.pow(radius,2);
    }

    @Override
    boolean compareTo(Object o) {
        if(!(o instanceof Circle)){
            return false;
        }
        else if(this.radius!=((Circle) o).getRadius()){
            return false;
        }else
            return true;
    }
}
