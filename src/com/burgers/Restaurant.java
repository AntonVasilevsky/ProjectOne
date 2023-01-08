package com.burgers;

public abstract class Restaurant {
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        System.out.println("MB prepared in restaurant"+"\n"+"Order executed");
        return burger;
    }
    abstract Burger createBurger();
}
