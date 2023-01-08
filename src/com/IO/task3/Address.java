package com.IO.task3;

import java.io.Serializable;

public class Address implements Serializable{
    private String street;
    private int building;
    private int apart;

    public Address(String street, int building, int apart) {
        this.street = street;
        this.building = building;
        this.apart = apart;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", building=" + building +
                ", apart=" + apart +
                '}';
    }
}
