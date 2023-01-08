package com.combat;

public class Enemy implements Moral{
    private int health ;
    private String name;

    public Enemy(int health) {
        this.health = health;

    }

    public int getHealth() {
        return health;
    }
    public String getName(){
        return name;
    }


    public void setHealth(int health) {
        this.health = health;
    }
    public void takeDamage(int damage){
        health = health-damage;
        System.out.println("Enemy still alive: "+ isAlive());
    }
    public void attackHero(Hero hero){

    }

    @Override
    public boolean isAlive() {
       return health>0;
    }
}
