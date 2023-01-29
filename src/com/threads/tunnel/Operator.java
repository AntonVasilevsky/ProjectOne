package com.threads.tunnel;

import java.util.Random;
import java.util.Stack;

public class Operator {
    private Tunnel northTunnel;
    private Tunnel southTunnel;

    private Object lock1 = new Object();
    private int counter = 25;


    private Stack<Train> eastCoast = new Stack<>();
    private Stack<Train> westCoast = new Stack<>();



    public Stack<Train> getEastCoast() {
        return eastCoast;
    }

    public Stack<Train> getWestCoast() {
        return westCoast;
    }



    public void operate(){

            moveEast();


            moveWest();

    }
    public void moveEast(){
        if(westCoast.size() != 0) {
            eastCoast.push(westCoast.pop());
            System.out.println("Train moves east in: " + Thread.currentThread().getName());
        }
    }
    public void moveWest(){
        if(eastCoast.size() != 0) {
            westCoast.push(eastCoast.pop());
            System.out.println("Train moves west in: " + Thread.currentThread().getName());
        }
    }

    public void trainGenerator(){
        Random rng = new Random();
        int counter = 4;
        while (counter > 0){
            if(rng.nextInt(2) == 0 && rng.nextInt(2) == 0){
                eastCoast.push(new Train());
                System.out.println("East size: "+eastCoast.size());
            }else {
                eastCoast.push(new Train());
                System.out.println("East size: "+eastCoast.size());
            }
            if(rng.nextInt(2) == 1 && rng.nextInt(2) == 0){
                westCoast.push(new Train());
                System.out.println("West size: "+westCoast.size());
            }else {
                westCoast.push(new Train());
                System.out.println("West size: "+westCoast.size());
            }
            counter--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
