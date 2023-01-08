package com.combat;

import java.util.Random;

public class Mage extends Hero{
    public Mage(String name, int health) {
        super(name, health);
    }
    @Override
    public boolean isAlive() {
        return super.getHealth()>0;
    }

    @Override
    void attackEnemy(Enemy enemy) {

        Random rnd = new Random();
        int damage = (rnd.nextInt(14)+7);
        enemy.takeDamage(damage);
        System.out.println(super.getName() + " casts a spell on " +enemy.getName() +"\n"+"damage="+damage);
        if(!enemy.isAlive()){
            System.out.println(enemy.getName()+" is dead\n"+ getName()+" wins!");
        }
    }

    @Override
    void takeDamage(int damage) {
        super.setHealth(super.getHealth()-damage);


    }
}
