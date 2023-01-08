package com.collections.hard;

import com.collections.hard.Dollar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Purchase {
    private String name;
    private Dollar price;
    private int quantity;
    public Purchase(){

    }
    public Purchase(String name, com.collections.hard.Dollar price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Purchase(String s){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(";")));
        this.name = list.get(0);
        this.price = new com.collections.hard.Dollar(Integer.parseInt(list.get(1)));
        this.quantity = Integer.parseInt(list.get(2));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price.getCentValue();
    }

    public void setPrice(int price) {
        //this.price = price;
        com.collections.hard.Dollar d = new Dollar(price);
       this.price = d;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getCost(){
        return price.getCentValue()*quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", quantity = " + quantity ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchase purchase)) return false;
        return name == purchase.name&&price.getCentValue()==purchase.price.getCentValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }
}
