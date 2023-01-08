package com.composes;

import java.util.Objects;

public class Material {
    private String name;
    private double density;

    public Material() {
    }

    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", density=" + density +
                '}'+';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Material material)) return false;
        return Double.compare(material.density, density) == 0 && name.equals(material.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, density);
    }
}
