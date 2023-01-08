package com.overriding;

import java.util.Random;

public class ErrorExample {
    private Cat tom ;
    public void foo() {
        int[] array = {1, 2, 3};

        try {
            tom.getName();
            array[1] = 1;
            int a = 3/0;
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException ex) {
            System.err.println("here is an error!");
        }
        System.out.println( "программа работает после обработки исключения");
    }
    public void  randomException () throws RuntimeException{
        Random rng = new Random();
        int random = rng.nextInt(3);
        String s = "abc";

       switch (random){
            case 0:
                tom.getName();
                break;
            case 1:
                s.charAt(6);
                break;
            case 2:
                int a = 3/0;
                break;
        }
    }
    public void fiftyPercent() throws Exception{
        Random rng = new Random();
        int random = rng.nextInt(2);
        if(random == 0){
            int a = 3/0;
        }else{
            System.out.println("Everything is fine");
        }
    }
    public void noFinally() {

            try {
                tom.getName();

                int a = 3 / 0;
            } catch (NullPointerException | ArithmeticException ex) {
                System.err.println("here is an error!");
                System.exit(1);         // while(true){}
            } finally {

                System.out.println("Everything is fine");
            }

    }
}
