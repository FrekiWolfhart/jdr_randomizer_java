package src.CaracteristiquesFactory;

import java.util.Random;

public class Halfling extends Caracteristiques{

    public Halfling(Random random){
        super(random);
        super.setCapacitéCombat(10);
        super.setCapacitéTir(30);
        super.setForce(10);
        super.setEndurance(10);
        super.setAgilité(30);
        super.setIntelligence(20);
        super.setForceMentale(20);
        super.setSociabilité(30);
        super.setBlessures(8);
        super.setBonusForce();
        super.setBonusEndurance();
        super.mouvement = 4;
        super.setPointDestin(2,2);
    }
}
