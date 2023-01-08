package com.combat;

abstract class Hero implements Moral{
    private String name;
    private int health;
    public Hero(String name, int health){
        this.name = name;
        this.health = health;
    }
    public String getName(){
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    abstract void attackEnemy(Enemy enemy);
    abstract void takeDamage(int damage);
}
