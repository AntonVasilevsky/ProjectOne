package com.classes.material;

public class Main {
    public static void main(String[] args) {
        Subject cord = new Subject("", new Material("Steel", 7900.0), 0.0);
        cord.setName("Steel cord");
        cord.setVolume(0.03);
        System.out.println("steel mass "+cord.getMass());
        cord.setMaterial(new Material("copper", 8500.0));
        System.out.println("copper mass "+cord.getMass());


    }
}
