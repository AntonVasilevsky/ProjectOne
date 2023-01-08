package com.patterns;

public class Main {
    public static void main(String[] args) {
        /*User.getUser();
        User.getUser();*/
        Worker worker = new Worker();
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        worker.work("book");
        worker1.work("pen");
        worker2.work("bag");
        worker.getStorage().getItems();





    }
}
