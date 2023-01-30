package com.threads.tubbel2;

import com.threads.tunnel.Tunnel;

import java.util.Date;

public class Train implements Runnable{
    private static int counter = 1;
    private int id;
    private static Tunnel tunnel = new Tunnel();
    private static Tunnel tunnel1 = new Tunnel();


    public Train() {
        id = counter;
        counter++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        operate();
    }
    public  void operate(){
        long startTime = System.currentTimeMillis();
        long elapsedTime = 0l;
        while (elapsedTime<2000) {
            elapsedTime = (new Date()).getTime() - startTime;
            synchronized (tunnel) {
                System.out.println("Train " + getId() + " North tunnel in thread "
                        + Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Train " + getId() + " has arrived");
            }
        }
        System.out.println("Train " + getId() + "switching a monitor");
        operate1();

    }
    public  void operate1() {
        long startTime = System.currentTimeMillis();
        long elapsedTime = 0l;
        while (elapsedTime < 2000) {
            elapsedTime = (new Date()).getTime() - startTime;
            synchronized (tunnel1) {
                System.out.println("Train " + getId() + " South tunnel in thread "
                        + Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Train " + getId() + " has arrived");
            }
        }
        System.out.println("Train " + getId() + "switching a monitor");
        operate();
    }
}
