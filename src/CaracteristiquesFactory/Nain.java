package src.CaracteristiquesFactory;

import java.util.Random;

public class Nain extends Caracteristiques{

    public Nain(Random random){
        super(random);
        super.setCapacitéCombat(30);
        super.setCapacitéTir(20);
        super.setForce(20);
        super.setEndurance(30);
        super.setAgilité(10);
        super.setIntelligence(20);
        super.setForceMentale(20);
        super.setSociabilité(10);
        super.setBlessures(11);
        super.setBonusForce();
        super.setBonusEndurance();
        super.mouvement = 3;
        super.setPointDestin(1,3);
    }
}
