package com.threads.ships;

public interface Loader {
    static void load(Ship ship) {
        int counter = 1;
        while (ship.getCapacity() > 0) {
            ship.setCapacity(ship.getCapacity() - 10);

            //System.out.println(counter);
            counter++;

            try {


                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
