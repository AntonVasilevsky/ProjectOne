package com.lambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Purchases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum sum;
        sum = (a,b,c) -> a+b+c;
        int total = sum.sumPrices(sc.nextInt(), sc.nextInt(), sc.nextInt());
        Percent percent;
        percent = (a)-> a%3==0;
        boolean hz = percent.divideThree(total);
        //Discount discount = (b)-> hz ? 30 : 50;

        //priceAfterDiscount(total, discount.finalDiscount(hz));
        priceAfterDiscount(total, hz, (b)->hz ? 30:50);





    }
    interface Sum{
       int sumPrices(int a, int b, int c);
    }
    interface Percent{
        boolean divideThree(int s);
    }
    interface Discount{
        int finalDiscount(boolean b);
    }
    public static void priceAfterDiscount (int price, boolean b, Discount discount){

        System.out.println("final price is " + (price - price/100* discount.finalDiscount(b)));
    }
}
