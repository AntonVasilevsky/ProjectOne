package com.IO.task3;

import java.io.*;

public class Employee extends Person implements Externalizable {
    private final String job = "abc";
    public Employee(){}


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(super.getName());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.setName(in.readUTF());
    }

    public Employee(String name, int age, int height, char gender, String hairColor, Address address, String job) {
        super(name, age, height, gender, hairColor, address);
        System.out.println("constructor emp");


    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                " job='" + job + '\'' +
                '}';
    }
}
