package day11.task2;

import day11.task2.Interfaces.PhysAttack;

public class Warrior extends Hero implements PhysAttack {
    private int magicDef;
    private int physDef;
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

    public Warrior() {
        magicDef = 0;
        physDef = 80;
        physAtt = 30;
    }

    public String toString(){
        return "Warrior{health=" + getHealth() + "}";
    }
}
