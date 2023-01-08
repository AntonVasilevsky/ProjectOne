package com.collections.hard;

public class Dollar {
    int centValue = 136;

    public Dollar() {
    }

    public int getCentValue() {
        return centValue;
    }

    public void setCentValue(int centValue) {
        this.centValue = centValue;
    }

    public Dollar(int centValue) {
        this.centValue = centValue;
    }
    public int summ(Dollar a){
       return this.centValue + a.centValue;
    }
    public int substract(Dollar a){
        return this.centValue - a.centValue;
    }
    public int multiply(Dollar a){
        return this.centValue * a.centValue;
    }
    public double divide(Dollar a){

        return (double) this.centValue / a.centValue;
    }

    @Override
    public String toString() {
        int big = centValue / 100;
        int small = centValue - big * 100;
        return  big + "." + small + " USD";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dollar dollar)) return false;
        return centValue == dollar.centValue;
    }

    public int compareTo(Dollar usd) {
        if (this.centValue < usd.centValue) {
            return -1;
        } else if (this.centValue > usd.centValue) {
            return 1;

        } else return 0;
    }
}
