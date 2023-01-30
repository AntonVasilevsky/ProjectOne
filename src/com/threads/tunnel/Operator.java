package com.threads.tunnel;

import java.util.Random;
import java.util.Stack;

public class Operator {
    private Tunnel northTunnel;
    private Tunnel southTunnel;




    private Stack<Train> eastCoast = new Stack<>();
    private Stack<Train> westCoast = new Stack<>();



    public Stack<Train> getEastCoast() {
        return eastCoast;
    }

    public Stack<Train> getWestCoast() {
        return westCoast;
    }



    public void operate(){
        while (true) {
            moveEast();


            moveWest();

        }

    }
    public void moveEast(){
        if(westCoast.size() != 0) {
            eastCoast.push(westCoast.pop());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Train moves east in: " + Thread.currentThread().getName());
        }
    }
    public void moveWest(){
        if(eastCoast.size() != 0) {
            westCoast.push(eastCoast.pop());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Train moves west in: " + Thread.currentThread().getName());
        }
    }

    public void trainGenerator(){
        Random rng = new Random();
        int counter = 6;
        while (counter > 0){
            eastCoast.push(new Train());
            System.out.println("East size: "+eastCoast.size());
            westCoast.push(new Train());
            System.out.println("West size: "+westCoast.size());
            counter--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
