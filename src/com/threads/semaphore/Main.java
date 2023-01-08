package com.threads.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Connection connection = Connection.getConnection();
        ExecutorService service = Executors.newFixedThreadPool(200);
        for (int i = 0; i < 200; i++) {


        service.submit(() -> {
            try {
                connection.work();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Connection{
    private static Connection connection = new Connection();
    private Semaphore semaphore = new Semaphore(10);
    private int connectionCounter;

    private Connection(){}
    // singleton
    public static Connection getConnection(){
        return connection;
    }
    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release(); // should be in finally
        }
    }

    private void doWork() throws InterruptedException {
       synchronized (this){
           connectionCounter++;
           System.out.println(connectionCounter);

       } // какая будет разница если написать sleep in synchronized? - поток держал бы монитор
        Thread.sleep(5000);
       synchronized (this){
           connectionCounter--;
       }
    }
}
