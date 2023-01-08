package com.threads.ships;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Random r = new Random();

       Ship ship = new Ship();
       ship.setType(Goods.BANANAS);

        if(ship.getType() == Goods.BANANAS){
        System.out.println("bananas");}
        else{
            System.out.println("non");
        }

    }

}
