package com.combat;

public class TrainingGround {
    public static void main(String[] args) {

        Mage mage = new Mage("Merlyn",100);
        Warrior warrior = new Warrior("Conan",10);
        Archer archer = new Archer("Robin",100);
        Zombie shon = new Zombie(11);
        shon.attackHero(mage);
        shon.attackHero(mage);
        shon.attackHero(mage);

    }
}
