package day11.task2;

import day11.task2.Interfaces.PhysAttack;
import day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements PhysAttack, Healer{
    private double health;
    private int magicDef;
    private int physDef;
    private int physAtt;
    private int healHimself;
    private int healTeammate;

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

    public Paladin() {
        health = 100;
        magicDef = 20;
        physDef = 50;
        physAtt = 15;
        healHimself = 25;
        healTeammate = 10;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double currentHealth = hero.getHealth() - (100 - hero.getPhysDef()) * 0.01 * physAtt;
        if (currentHealth > 0)
            hero.setHealth(currentHealth);
        else
            hero.setHealth(0);
    }

    @Override
    public void healHimself() {
        health += healHimself;
        if (health > 100)
            health = 100;
    }

    @Override
    public void healTeammate(Hero hero) {
        double currentHealth = hero.getHealth() + healTeammate;
        if (currentHealth < 100)
            hero.setHealth(currentHealth);
        else
            hero.setHealth(100);
    }

    public String toString(){
        return "Paladin{health=" + getHealth() + "}";
    }
}
