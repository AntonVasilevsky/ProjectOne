package com.IO.task3;

import java.io.Externalizable;
import java.io.Serial;
import java.io.Serializable;

public class Person  {
    @Serial
    private static final long serialVersionUID = 1L;
    private static int id;
    private transient  String name ;
    private  int age ;
    private int height;
    private char gender;
    private  Address address;

    private String hairColor;

    public Person() {
        System.out.println("constructor person no param");
    }

    public Person(String name, int age, int height, char gender, String hairColor, Address address) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.hairColor = hairColor;
        this.address = address;
        id++;
        System.out.println("constructor person");
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", gender=" + gender +
                ", hairColor='" + hairColor + '\'' +", "+
                address + '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setName(String name) {
        this.name = name;
    }
}
