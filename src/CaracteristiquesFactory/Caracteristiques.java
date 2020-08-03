package src.CaracteristiquesFactory;

import java.util.Random;

public abstract class Caracteristiques {

    protected Random random;
    protected int capaciteCombat;
    protected int capaciteTir;
    protected int force;
    protected int endurance;
    protected int agilite;
    protected int intelligence;
    protected int forceMentale;
    protected int sociabilite;
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

    protected void setCapaciteCombat(int base){
        this.capaciteCombat = calculerStat(base);
    }

    protected void setCapaciteTir(int base){
        this.capaciteTir = calculerStat(base);
    }

    protected void setForce(int base){
        this.force = calculerStat(base);
    }

    protected void setEndurance(int base){
        this.endurance = calculerStat(base);
    }

    protected void setAgilite(int base){
        this.agilite = calculerStat(base);
    }

    protected void setIntelligence(int base){
        this.intelligence = calculerStat(base);
    }

    protected void setForceMentale(int base){
        this.forceMentale = calculerStat(base);
    }

    protected void setSociabilite(int base){
        this.sociabilite = calculerStat(base);
    }

    private boolean isBetween(int de, int minimum, int maximum){
        return minimum <= de && de <= maximum;
    }

    protected void setBlessures(int minimum){
        int de = this.random.nextInt(10)+1;
        if(this.isBetween(de, 1, 3)) this.blessures = minimum;
        else if(this.isBetween(de, 4, 6)) this.blessures = (minimum + 1);
        else if(this.isBetween(de, 7, 9)) this.blessures = (minimum + 2);
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
        System.out.println(this.capaciteCombat + " " + this.capaciteTir + " " + this.force + " " + this.endurance + " " +
                           this.agilite + "  " + this.intelligence + "  " + this.forceMentale + " " + this.sociabilite);
        System.out.println("A B BF BE  M Mag PF PD");
        System.out.println(this.attaques + " " + this.blessures + " " + this.bonusForce + "  " + this.bonusEndurance + "  " +
                           this.mouvement + "  " + this.pointMagie + "  " + this.pointFolie + "  " + this.pointDestin);
    }
}
