package day11.task2;

import day11.task2.Interfaces.PhysAttack;
import day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements PhysAttack, Healer{
    private int magicDef;
    private int physDef;
    private int physAtt;
    private int healHimself;
    private int healTeammate;

    public int getMagicDef() {
        return magicDef;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public Paladin() {
        magicDef = 20;
        physDef = 50;
        physAtt = 15;
        healHimself = 25;
        healTeammate = 10;
    }

    @Override
    public void healHimself() {
        super.setHealth(super.getHealth() + healHimself);
        if (super.getHealth() > 100)
            super.setHealth(100);
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
