package com.burgers;

public class VeganRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        Burger vegan = new VeganBurger();
        return vegan;
    }
}
