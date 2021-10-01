package day11.task2;

import day11.task2.Interfaces.PhysAttack;
import day11.task2.Interfaces.MagicAttack;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    private int magicDef;
    private int physDef;
    private int magicAtt;
    private int physAtt;

    public int getMagicDef() {
        return magicDef;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public Magician() {
        magicDef = 80;
        physDef = 0;
        magicAtt = 20;
        physAtt = 5;
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
    public String toString(){
        return "Magician{health=" + getHealth() + "}";
    }
}
