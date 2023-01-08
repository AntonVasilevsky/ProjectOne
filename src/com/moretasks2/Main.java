package com.moretasks2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        double a = 5.0;
        Integer n = 52322;
        int e = 1;


        System.out.println(isInteger(a));
        Worker worker = new Worker(6, 8);
        Worker worker1 = new Worker(8, 64);
        System.out.println(hoursPerWeek(worker));
        System.out.println(hoursPerWeek(worker1));
        System.out.println(isPalindrome(n));
        table(sc);

    }
    public static boolean isInteger (double d){
        if(d%1>0){
            return false;
        }else
            return true;
    }
    public static int hoursPerWeek(Worker worker){
        if(worker.getHours()>60){
            worker.setHours(60);
        }
        if(worker.getDollars()<8){
            worker.setDollars(8);
        }
        return worker.getHours()*worker.getDollars();
    }
    public static boolean isPalindrome(Integer n){
        String s = n.toString();
       if(s.length()%2==0){
           return s.substring(0, s.length()/2).equals(s.substring(2));
       }else {
           return s.substring(0, s.length()/2).equals(s.substring( s.length()/2+1));
       }
    }
    public static void table(Scanner sc){
        int console = sc.nextInt();
        for (int i = 1; i <11 ; i++) {

            System.out.println(console+"*"+i+"="+(console*i));
        }
    }


}
