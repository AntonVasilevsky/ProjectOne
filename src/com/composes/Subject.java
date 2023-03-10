package com.composes;

import java.util.Objects;

public class Subject {
    private String name;
    private Material material;
    private double volume;

    public Subject() {}
    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getMass(){
       return material.getDensity()*volume;
    }
    public String toString(){

        String mVol = Double.toString(Math.round(volume)/100.0);
        return name+";"+material.toString()+" volume "+mVol;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject subject)) return false;
        return Double.compare(subject.volume, volume) == 0 && Objects.equals(name, subject.name) && Objects.equals(material, subject.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, material, volume);
    }
}
