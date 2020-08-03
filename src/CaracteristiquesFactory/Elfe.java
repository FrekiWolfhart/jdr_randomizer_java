package src.CaracteristiquesFactory;

import java.util.Random;

public class Elfe extends Caracteristiques {

    public Elfe(Random random){
        super(random);
        super.setCapaciteCombat(20);
        super.setCapaciteTir(30);
        super.setForce(20);
        super.setEndurance(20);
        super.setAgilite(30);
        super.setIntelligence(20);
        super.setForceMentale(20);
        super.setSociabilite(20);
        super.setBlessures(9);
        super.setBonusForce();
        super.setBonusEndurance();
        super.mouvement = 5;
        super.setPointDestin(1,2);
    }
}
