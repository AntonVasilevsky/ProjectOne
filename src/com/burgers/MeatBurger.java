package com.burgers;

public class MeatBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("adding meat cutlet");
    }
}
