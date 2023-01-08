package com.threads.synchronizedExample;

public class Test {
    private int counter;
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        test.doWork();

    }
    public synchronized void increment(){
        counter++;
    }

    public void doWork() throws InterruptedException {
        Thread tr1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                    //counter++;
                }
            }
        });
       Thread tr2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                   increment();
                    //counter++;
                }
            }
        });
        tr1.start();
        tr1.join();
        tr2.start();
        tr2.join();
        Thread.sleep(2000);
        System.out.println(counter);



    }
}
