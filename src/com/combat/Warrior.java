package com.combat;

public class Warrior extends Hero{
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        enemy.takeDamage(7);
        System.out.println(super.getName() + " hits enemy with sword");
    }

    @Override
    void takeDamage(int damage) {
        super.setHealth(super.getHealth()-damage);
        System.out.println("Hero is still alive: "+ isAlive());
    }
    @Override
    public boolean isAlive() {
        return super.getHealth()>0;
    }
}
