package com.burgers;

public class VeganBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("adding soy cutlet");

    }
}
