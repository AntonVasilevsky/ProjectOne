package com.composes;

public class Main {
    public static void main(String[] args) {
        Material m = new Material("steel", 12.9);
        Material copper = new Material("copper", 8500);
        Subject wire = new Subject("wire", m, 3);
        wire.setMaterial(copper);

        System.out.println("The wire mass is "+Math.round(wire.getMass())/100.0+" kg");
        Subject subject = new Subject();
        Subject subject1 = new Subject();
        subject.setVolume(180.0);
        System.out.println(subject.getVolume());
        subject1.setVolume(190.0);

        System.out.println(subject1.getVolume());
        System.out.println(subject1.getVolume()+ subject.getVolume()/2);





    }


}
