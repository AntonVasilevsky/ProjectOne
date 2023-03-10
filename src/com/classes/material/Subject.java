package com.classes.material;

public class Subject {
    private String name;
    private Material material;
    private Double volume;

    public Subject() {

    }

    public Subject(String name, Material material, Double volume) {
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

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", material=" + material +
                ", volume=" + volume +
                '}';
    }
    public Double getMass(){
        return material.getDensity()*volume;
    }
}
