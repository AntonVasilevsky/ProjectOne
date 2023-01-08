package com.burgers;

public class Main {
    public static void main(String[] args) {
        Restaurant beefResto = new MeatRestaurant();
        Restaurant veganResto = new VeganRestaurant();
        Burger orderMeat = beefResto.orderBurger();
        //Burger orderVegan = veganResto.orderBurger();
    }
}
