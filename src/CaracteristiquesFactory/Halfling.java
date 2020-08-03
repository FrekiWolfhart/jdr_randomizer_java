package src.CaracteristiquesFactory;

import java.util.Random;

public class Halfling extends Caracteristiques{

    public Halfling(Random random){
        super(random);
        super.setCapaciteCombat(10);
        super.setCapaciteTir(30);
        super.setForce(10);
        super.setEndurance(10);
        super.setAgilite(30);
        super.setIntelligence(20);
        super.setForceMentale(20);
        super.setSociabilite(30);
        super.setBlessures(8);
        super.setBonusForce();
        super.setBonusEndurance();
        super.mouvement = 4;
        super.setPointDestin(2,2);
    }
}
