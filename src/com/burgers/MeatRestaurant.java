package com.burgers;

public class MeatRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        Burger beef = new MeatBurger();
        System.out.println("MB created in MeatRestaurant");
        return beef;
    }
}
