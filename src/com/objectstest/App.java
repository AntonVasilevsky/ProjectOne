package com.objectstest;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setHeight(180);
        System.out.println(p1.getHeight());
        p2.setHeight(190);
        System.out.println(p1.getHeight());
        System.out.println(p2.getHeight()+ p1.getHeight()/2);
        System.out.println(1390/100);

    }

}

