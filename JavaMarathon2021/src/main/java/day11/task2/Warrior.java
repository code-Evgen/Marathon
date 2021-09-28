package day11.task2;

import day11.task2.Interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {
    private double health;
    private int magicDef;
    private int physDef;
    private int physAtt;

    public double getHealth() {
        return health;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public int getPhysDef() {
        return physDef;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public Warrior() {
        health = 100;
        magicDef = 0;
        physDef = 80;
        physAtt = 30;
    }

    public void physicalAttack(Hero hero) {
        double currentHealth = hero.getHealth() - (100 - hero.getPhysDef()) * 0.01 * physAtt;
        if (currentHealth > 0)
            hero.setHealth(currentHealth);
        else
            hero.setHealth(0);
    }

    public String toString(){
        return "Warrior{health=" + getHealth() + "}";
    }
}
