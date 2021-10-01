package day11.task2;


public abstract class Hero {
    private double health;

    public Hero(){
        health = 100;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public abstract int getMagicDef();

    public abstract int getPhysDef();

    public abstract int getPhysAtt();


    public void physicalAttack(Hero hero) {
        double currentHealth = hero.getHealth() - (100 - hero.getPhysDef()) * 0.01 * getPhysAtt();
        if (currentHealth > 0)
            hero.setHealth(currentHealth);
        else
            hero.setHealth(0);
    }
}
