package com.threads.ships;

import java.util.Random;

public class Ship {
    private int capacity;
    private Goods type;

    public Ship() {
    }

    public Ship(Random random){
        switch (random.nextInt(1,4)){
            case 1:
                this.capacity = 10;
                break;
            case 2:
                this.capacity = 50;
                break;
            case 3:
                this.capacity = 100;
                break;
        }
        switch (random.nextInt(1,4)){
            case 1:
                this.type = Goods.BANANAS;
                break;
            case 2:
                this.type = Goods.BREAD;
                break;
            case 3:
                this.type = Goods.CLOTHES;
                break;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Goods type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nShip{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}
