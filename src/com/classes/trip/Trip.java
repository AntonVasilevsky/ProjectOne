package com.classes.trip;

public class Trip {
    private String name;
    private final int DAILY_EXPENSES = 5000;
    private int transportExp;
    private int durationDays;

    public Trip() {
    }

    public Trip(String name, int transportExp, int durationDays) {
        this.name = name;
        this.transportExp = transportExp;
        this.durationDays = durationDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDAILY_EXPENSES() {
        return DAILY_EXPENSES;
    }

    public int getTransportExp() {
        return transportExp;
    }

    public void setTransportExp(int transportExp) {
        this.transportExp = transportExp;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }
    public int getTotal(){
        return (transportExp+DAILY_EXPENSES)*durationDays;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "name='" + name + '\'' +
                ", DAILY_EXPENSES=" + ((DAILY_EXPENSES-DAILY_EXPENSES%100)/100) +"."+DAILY_EXPENSES%100+" USD" +
                ", transportExp=" + ((transportExp-transportExp%100)/100) +"."+transportExp%100+" USD" +
                ", durationDays=" + durationDays +
                '}';
    }
}
