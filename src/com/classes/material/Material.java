package com.classes.material;

public class Material {
    private String name;
    private double density;

    public Material() {
    }

    public Material(String name, Double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public Double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", density=" + density +
                '}';
    }
}
