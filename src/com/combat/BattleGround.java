package com.combat;

public class BattleGround {
    public static void main(String[] args) {
        Hero mage = new Mage("Merlin", 20);
        Enemy enemy = new Zombie(20);
        Vampire vampire = new Vampire(20);
        fight(mage, vampire);


    }
    public static void fight(Hero mage, Enemy enemy){
        while (enemy.isAlive()&& mage.isAlive()){
            mage.attackEnemy(enemy);
            if(!enemy.isAlive()){
                continue;
            }
            enemy.attackHero(mage);
        }
    }
}
