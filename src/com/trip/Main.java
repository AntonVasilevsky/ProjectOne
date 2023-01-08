package com.trip;

public class Main {
    public static void main(String[] args) {
       Trip[] trips = new Trip[5];
       trips[0] = new Trip("Bali", 100000, 30);
       trips[1] = new Trip("Phuket", 98000, 31);
       trips[2] = new Trip("Argentina", 93, 45);

       trips[4] = new Trip();
       trips[4].setTransportExpenses(65000);
        System.out.println(trips[1].getDays()+trips[2].getDays());
        for (Trip t:trips
             ) {
            if(t==null){
                continue;
            }
            System.out.println(t);
        }
    }
}
