package src.CaracteristiquesFactory;

import java.util.Random;

public abstract class Caracteristiques {

    protected Random random;
    protected int capacitéCombat;
    protected int capacitéTir;
    protected int force;
    protected int endurance;
    protected int agilité;
    protected int intelligence;
    protected int forceMentale;
    protected int sociabilité;
    protected final int attaques = 1;
    protected int blessures;
    protected int bonusForce;
    protected int bonusEndurance;
    protected int mouvement;
    protected final int pointMagie = 0;
    protected final int pointFolie = 0;
    protected int pointDestin;

    Caracteristiques(Random random){
        this.random = random;
    }

    private int calculerStat(int base){
        return (base + (this.random.nextInt(10)+1) + (this.random.nextInt(10)+1));
    }

    private int calculerBonus(int stat){
        return (stat / 10);
    }

    protected void setCapacitéCombat(int base){
        this.capacitéCombat = calculerStat(base);
    }

    protected void setCapacitéTir(int base){
        this.capacitéTir = calculerStat(base);
    }

    protected void setForce(int base){
        this.force = calculerStat(force);
    }

    protected void setEndurance(int base){
        this.endurance = calculerStat(base);
    }

    protected void setAgilité(int base){
        this.agilité = calculerStat(base);
    }

    protected void setIntelligence(int base){
        this.intelligence = calculerStat(base);
    }

    protected void setForceMentale(int base){
        this.forceMentale = calculerStat(base);
    }

    protected void setSociabilité(int base){
        this.sociabilité = calculerStat(base);
    }

    private boolean isBetween(int dé, int minimum, int maximum){
        return minimum <= dé && dé <= maximum;
    }

    protected void setBlessures(int minimum){
        int dé = this.random.nextInt(10)+1;
        if(this.isBetween(dé, 1, 3)) this.blessures = minimum;
        else if(this.isBetween(dé, 4, 6)) this.blessures = (minimum + 1);
        else if(this.isBetween(dé, 7, 9)) this.blessures = (minimum + 2);
        else this.blessures = (minimum + 3);
    }

    protected void setBonusForce(){
        this.bonusForce = calculerBonus(this.force);
    }

    protected void setBonusEndurance(){
        this.bonusEndurance = calculerBonus(this.endurance);
    }

    protected void setPointDestin(int base, int var){
        this.pointDestin = this.random.nextInt(var) + base;
    }

    public void print(){
        System.out.println("CARACTÉRISTIQUES");
        System.out.println("CC CT  F E  Ag  Int FM Soc");
        System.out.println(this.capacitéCombat + " " + this.capacitéTir + " " + this.force + " " + this.endurance + " " +
                           this.agilité + "  " + this.intelligence + "  " + this.forceMentale + " " + this.sociabilité);
        System.out.println("A B BF BE  M Mag PF PD");
        System.out.println(this.attaques + " " + this.blessures + " " + this.bonusForce + "  " + this.bonusEndurance + "  " +
                           this.mouvement + "  " + this.pointMagie + "  " + this.pointFolie + "  " + this.pointDestin);
    }
}
