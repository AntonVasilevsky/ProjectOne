package com.geometry;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(25.0);
        Circle c2 = new Circle(26.0);
        Circle c3 = new Circle(25.0);
        Quadrilateral q1 = new Quadrilateral(2,3);
        Quadrilateral q2 = new Quadrilateral(3,3);
        System.out.println(q1.calculateSquare());
        System.out.println(q1.calculatePerimeter());
        System.out.println(q1.compareTo(q2));

        System.out.println(c1.compareTo(q1));
        System.out.println(c1.compareTo(c3));
        CurrentDate date = new CurrentDate(2022, Month.SEPTEMBER, 28, DayOfWeek.THURSDAY);
        System.out.println(Arrays.toString(DayOfWeek.values()));
        System.out.println(date);
        DateDefiner definer = new DateDefiner();
        System.out.println(definer.getCurrentDate().toString());
        LocalDate x = LocalDate.now();
        System.out.println(x);


    }


}
