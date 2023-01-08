package com.trip;

public class Trip {
    private final int DAILY_EXPENSES = 5000;
    private String name;
    private int transportExpenses;
    private int days;

    public Trip() {
    }

    public Trip(String name, int transportExpenses, int days) {
        this.name = name;
        this.transportExpenses = transportExpenses;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTransportExpenses() {
        return transportExpenses;
    }

    public void setTransportExpenses(int transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDAILY_EXPENSES() {
        return DAILY_EXPENSES;
    }
    public String centsToUsd(int n){
        String big = Integer.toString(n/100);
        String small = Integer.toString(n%100);
        return big.concat(".").concat(small);
    }


    @Override
    public String toString() {
        return "Trip{" +
                "DAILY_EXPENSES=" + centsToUsd( DAILY_EXPENSES) +
                ", name='" + name + '\'' +
                ", transportExpenses=" + centsToUsd(transportExpenses) +
                ", days=" + days +
                '}';
    }
    // сделать getTotal
    public String getTotal(){
        String tot = centsToUsd((DAILY_EXPENSES+transportExpenses)*days);
        return tot;
    }
}
