package src.CaracteristiquesFactory;

import java.util.Random;

public class Elfe extends Caracteristiques {

    public Elfe(Random random){
        super(random);
        super.setCapacitéCombat(20);
        super.setCapacitéTir(30);
        super.setForce(20);
        super.setEndurance(20);
        super.setAgilité(30);
        super.setIntelligence(20);
        super.setForceMentale(20);
        super.setSociabilité(20);
        super.setBlessures(9);
        super.setBonusForce();
        super.setBonusEndurance();
        super.mouvement = 5;
        super.setPointDestin(1,2);
    }
}
