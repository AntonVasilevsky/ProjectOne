package com.threads.tubbel2;

import com.threads.tunnel.Tunnel;

public class Train implements Runnable{
    private static int counter = 1;
    private int id;
    private static Tunnel tunnel = new Tunnel();

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
        synchronized (tunnel) {
            System.out.println("Train " + getId() + " starts moving in thread "
                    + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Train " + getId() + " has arrived");
        }
    }
}
