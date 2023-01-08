package com.collections.hard;

import com.collections.hard.Dollar;
import com.collections.hard.Purchase;

import java.util.Scanner;

public class PricePurchase extends Purchase {
    private int discount;

    public PricePurchase() {
    }

    public PricePurchase(String name, Dollar price, int quantity, int discount) {
        super(name, price, quantity);

        this.discount = discount;
    }
    public PricePurchase(String name, int price, int quantity, int discount) {
        super(name, new Dollar(price), quantity);
        this.discount = discount;
    }

    public PricePurchase(String s) {
        super(s);
        int index = s.lastIndexOf(";");
        String substring = s.substring(index+1);
        this.discount = Integer.parseInt(substring);
    }

    @Override
    public int getCost() {
        return (super.getPrice()-discount)*super.getQuantity();
    }
    protected String fieldsToString(){
        int big = this.getCost() / 100;
        int small = this.getCost() - big * 100;
        return ", discount = " + discount +
                " cost = " + big + "." + small + " USD"+
                '}';
    }

    @Override
    public String toString() {
        return super.toString() + fieldsToString();

    }

}
