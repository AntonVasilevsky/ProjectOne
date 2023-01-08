package com.moretasks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "abcdef";
        int a = s.length();
        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println("reverse method");
        reverse(chars, a);
        System.out.println();
        System.out.println(s.charAt(s.length()-1));
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phill", "Matt", "Alex", "Emma", "John", "James"};
        int[] times = {234, 432,186, 937, 156, 154, 231, 471, 211, 258 };
        List<Runner> runners = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            runners.add(new Runner(names[i], i, times[i]));
        }
        Arrays.sort(times);
        seeTop3(times, runners);
        factorial(3);
        System.out.println(fact(3));





    }
        public static void reverse (char[] chars, int a){
            int length = a-1;
            System.out.print(chars[length]);
            if(length==0)
                return;
            reverse(chars,  a -1 );

        }
        public static int getTimeIndex(int[] times){
            int minValue = times[0];
            int minIndex = 0;
        for (int i = 0; i < times.length-1; i++) {
                if (times[i+1]<minValue){
                    minValue = times[i+1];
                    minIndex = i+1;

                }
            }
        return minIndex;
        }
        public static void seeTop3(int[] times, List<Runner> runners){
            for (Runner r : runners
                 ) {
                    if(r.getTime()==times[0]){
                        System.out.println("First place \n"+ r);
                }
            }
            for (Runner r : runners
            ) {
                if(r.getTime()==times[1]){
                    System.out.println("Second place \n"+ r);
                }
            }
            for (Runner r : runners
            ) {
                if(r.getTime()==times[2]){
                    System.out.println("Third place \n"+ r);
                }
            }
        }
    static int result = 1;
        public static void factorial(int x){

             result *=x;
        if(x==1){
            System.out.println(result);
            return;
        }

        factorial(x-1);
        }

    public static int fact(int x){
            if(x==1){
                return 1;
            }
            return x * fact(x-1);
    }



}
