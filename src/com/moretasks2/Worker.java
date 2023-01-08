package com.moretasks2;

public class Worker {
    private int dollars;
    private int hours;

    public Worker(int dollars, int hours) {
        this.dollars = dollars;
        this.hours = hours;
    }

    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
