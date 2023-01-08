package com.combat;

import java.util.Random;

public class Zombie extends Enemy{
    private String name = "Zombie";
    public Zombie(int health) {
        super(health);
    }
    public String getName(){
        return name;
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth()-damage);
        Random rnd = new Random();
        int superpower = rnd.nextInt(10);
        if(superpower>8){
            setHealth(getHealth()+3);
            System.out.println("SUPERPOWER");
        }
    }

    @Override
    public void attackHero(Hero hero) {
        if(hero.isAlive()){

        Random rnd = new Random();
        int damage = rnd.nextInt(10)+1;
        hero.takeDamage(damage);
        System.out.println(name+" attacks "+hero.getName()+", damage="+damage);
        if(!hero.isAlive()){
            System.out.println(hero.getName()+" is dead \n"+ name + " wins!");
        }
        }

    }
}
