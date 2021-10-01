package day11.task2;

import day11.task2.Interfaces.PhysAttack;
import day11.task2.Interfaces.MagicAttack;
import day11.task2.Interfaces.Healer;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private int magicDef;
    private int physDef;
    private int magicAtt;
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

    public Shaman() {
        magicDef = 20;
        physDef = 20;
        magicAtt = 15;
        physAtt = 10;
        healHimself = 50;
        healTeammate = 30;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double currentHealth = hero.getHealth() - (100 - hero.getMagicDef()) * 0.01 * magicAtt;
        if (currentHealth > 0)
            hero.setHealth(currentHealth);
        else
            hero.setHealth(0);
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
        return "Shaman{health=" + getHealth() + "}";
    }
}
