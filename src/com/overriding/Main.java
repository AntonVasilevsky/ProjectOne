package com.overriding;

public class Main {
    public static void main(String[] args)  {
        ErrorExample ex = new ErrorExample();
        //ex.foo();
       /* TASK 6
       try{
            ex.randomException();
        }catch(Exception e){
            e.printStackTrace();
        }*/
        // TASK 7
       /* try{
            ex.fiftyPercent();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("программа продолжает работать");
        }*/

        // TASK 8
        ex.noFinally();
    }



}
