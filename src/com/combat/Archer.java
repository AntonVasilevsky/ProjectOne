package com.combat;

public class Archer extends Hero{
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        enemy.takeDamage(5);
        System.out.println(super.getName() + " hits enemy with arrow");
    }
    @Override
    public boolean isAlive() {
        return super.getHealth()>0;
    }

    @Override
    void takeDamage(int damage) {
        super.setHealth(super.getHealth()-damage);
        System.out.println("Hero is still alive: "+ isAlive());
    }
}
