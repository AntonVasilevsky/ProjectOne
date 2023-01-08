package com.classes.trip;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Trip[] trips = new Trip[5];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            trips[i] = new Trip("trip"+i, random.nextInt(10000), random.nextInt(20) );
            sum += trips[i].getDurationDays();
        }
        trips[4] = new Trip();
        trips[4].setTransportExp(44);
        System.out.println("Total days sum = "+sum);


        Arrays.stream(trips).forEach(System.out::println);


    }
}
