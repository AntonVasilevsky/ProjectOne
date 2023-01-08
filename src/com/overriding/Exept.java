package com.overriding;

public class Exept extends RuntimeException{
  String name = "sf";
  String message;

    public Exept() {
    }
    public Exept(String message, String name){
        this.message = message;
        this.name = name;
    }



    public String getName() {
        return name = null;
    }
}
