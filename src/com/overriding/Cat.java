package com.overriding;

public class Cat extends Whale{
    private String name = null;

    @Override
    public String getName() {
        return this.name;
    }



}
