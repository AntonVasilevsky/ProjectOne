package com.threads.ships;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainShips {
    public static void main(String[] args) {
        Manager manager = new Manager();
        ExecutorService service = Executors.newFixedThreadPool(5);

            service.submit(manager.getShips());
            service.submit(manager.sendShips());
            service.submit(manager.bananaLoader());
            service.submit(manager.breadLoader());
            service.submit(manager.clothesLoader());

        Thread t1 = new Thread(() -> {

                manager.getShips();

        });
        Thread t2 = new Thread(() -> {

                manager.sendShips();

        });
        Thread banana = new Thread(() -> {

                manager.bananaLoader();

        });
        Thread bread = new Thread(() -> {

                manager.breadLoader();

        });
        Thread clothes = new Thread(() -> {

                manager.clothesLoader();

        });

        t1.start();
        t2.start();
        banana.start();
        bread.start();
        clothes.start();
    }

    static class Manager implements Loader {
        private int loadedShips = 0;
        private Queue<Ship> capacity = new LinkedList();
        private final int TUNNEL_LIMIT = 5;

        private Queue<Ship> pier = new LinkedList();
        private boolean banana = false;
        private boolean bread = false;
        private boolean clothes = false;

        private final int PIER_LIMIT = 3;

        private Queue<Ship> bufferQueue = new LinkedList<>();
        private final Object lock = new Object();
        private final Object lock2 = new Object();


        public Runnable getShips()  {
            while (true) {
                synchronized (lock) {
                    while (capacity.size() == TUNNEL_LIMIT) {

                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    capacity.offer(new Ship(new Random()));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //System.out.println("Ship added, tunnel has " + capacity.size() + " ships inside");
                    lock.notify();
                }
            }
        }

        public Runnable sendShips()  {
            while (true) {

                synchronized (lock) {
                    while (capacity.size() == 0) {
                        try{
                            lock.wait();
                        } catch (InterruptedException e){
                            throw new RuntimeException();
                        }
                    }
                    bufferQueue.add(capacity.poll());
                    //System.out.println("ship left the tunnel");

                    lock.notify();

                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public Runnable bananaLoader()  {

            while (true){

                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(bufferQueue.element().getType() == Goods.BANANAS && pier.size()<3){
                        banana = true;
                        Ship ship = bufferQueue.poll();
                        pier.add(ship);
                        assert ship != null;
                        Loader.load(ship);
                        pier.remove(ship);

                        banana = false;
                        System.out.println(ship + "loaded and left the pier");
                        System.out.println("loaded ships: " + ++loadedShips);
                    }


            }
        }

        public Runnable breadLoader()  {

            while (true){

                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(bufferQueue.element().getType() == Goods.BREAD && pier.size()<3){
                    bread = true;
                    Ship ship = bufferQueue.poll();
                    pier.add(ship);
                    assert ship != null;
                    Loader.load(ship);
                    pier.remove(ship);

                    bread = false;
                    System.out.println(ship + "loaded and left the pier");
                    System.out.println("loaded ships: " + ++loadedShips);
                }


            }
        }

        public Runnable clothesLoader()  {

            while (true){

                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(bufferQueue.element().getType() == Goods.CLOTHES && pier.size()<3){
                    clothes = true;
                    Ship ship = bufferQueue.poll();
                    pier.add(ship);
                    assert ship != null;
                    Loader.load(ship);
                    pier.remove(ship);

                    clothes = false;
                    System.out.println(ship + "loaded and left the pier");
                    System.out.println("loaded ships: " + ++loadedShips);

                }


            }
        }
    }
}
